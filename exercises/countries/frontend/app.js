
angular.module('country', [])

    .filter('nameOrCodeMatch', function() {

        function nameOrCodeFilter(data, searchWord) {
            if (!searchWord) return data;

            var expression = new RegExp(searchWord, 'i');

            return data.filter(function(item) {
                return (expression.test(item.name) || expression.test(item.code));
            });
        }

        nameOrCodeFilter.$stateful = true;

        return nameOrCodeFilter;

    })

    .factory('countryList', ['$http', function($http) {
        return function() {
            return $http.get('http://localhost/countryapi/public/countries');
        };
    }])

    .controller('countryController', ['$scope', 'countryList', function($scope, CountryList) {

        CountryList()
            .success(function(data) {
                $scope.countries = data;
            });

        $scope.countrySearch = "";
    }]);

