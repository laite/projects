
angular.module('country', [])

    .filter('nameOrCodeMatch', function() {

        function nameOrCodeFilter(data, searchWord) {
            if (!searchWord) return data;

            var expression = new RegExp(searchWord, 'i');

            return data.filter(function(item) {
                return (expression.test(item.name) || expression.test(item.code));
            });
        }

        // We need to run this on every change since it depends on the countries - list
        nameOrCodeFilter.$stateful = true;

        return nameOrCodeFilter;

    })

    .factory('countryList', ['$http', function($http) {
        return function() {
            return $http.get('http://localhost/countryapi/public/countries');
        };
    }])

    .factory('countryDetail', ['$http', function($http) {
        return function(id) {
            return $http.get('http://localhost/countryapi/public/countries/' + id);
        };
    }])

    .directive('countryDetail', function() {
        return {
            restrict: 'E',
            template: '<div>' +
                '<h2>{{ selectedCountry.name }}</h2>' + 
                '<ul>' +
                '<li> Capital: {{ selectedCountry.capital }} </li>' +
                '<li> Population: {{ selectedCountry.population }} </li>' +
                '</ul></div>',
            link: function(scope, element, attrs) {
                scope.showDetails = function() {
                    element.removeClass('hidden');
                };
            }
        };
    })

    .controller('countryController', ['$scope', 'countryList', 'countryDetail', function($scope, CountryList, CountryDetail) {

        $scope.countrySearch = "";
        $scope.selectedCountry = {};
        $scope.showDetails = false;

        CountryList()
            .success(function(data) {
                $scope.countries = data;
            });

        $scope.selectCountry = function (country) {
            CountryDetail(country.id)
                .success(function(data) {
                    data.name = country.name; // our API doesn't provide country name on detailed information
                    $scope.selectedCountry = data;
                    $scope.showDetails();
                });
        };

    }]);

