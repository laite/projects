
angular.module('country', [])

    .factory('countryList', ['$http', function($http) {
        return function() {
            return $http.get('http://localhost/countryapi/public/countries');
        };
    }])

    .controller('countryController', ['$scope', 'countryList', function($scope, CountryList) {

        // find by name or code based on the search box
        $scope.nameOrCodeMatch =  function(data) {
            if (!$scope.countrySearch) return true;

            return ($scope.countrySearch === data.name || $scope.countrySearch === data.code);
        };

        CountryList()
            .success(function(data) {
                $scope.countries = data;
            });

        $scope.countrySearch = "";
    }]);

