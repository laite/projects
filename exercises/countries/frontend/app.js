
angular.module('country', [])
    .controller('countryController', ['$scope', function($scope) {
        $scope.countries = [{ 'name': 'Suomi' }, { 'name': 'Ruotsi'}];
        $scope.countrySearch = "";
    }]);
    
