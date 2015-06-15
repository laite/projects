
angular.module('country', [])

    .filter('nameOrCodeMatch', function() {

        function nameOrCodeFilter(data, searchWord) {
            if (!searchWord) return data;

            data = data.filter(function(item) {
                return ((item.name === searchWord) || (item.code === searchWord));
            });

            return data;
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

