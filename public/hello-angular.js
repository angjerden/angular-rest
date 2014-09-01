//Based on: https://spring.io/guides/gs/consuming-rest-angularjs/
function Hello($scope, $http) {
    $http.get('http://rest-service.guides.spring.io/greeting').
    //$http.get('http://localhost:8080/greeting').
        success(function(data) {
            $scope.greeting = data;
        });
}