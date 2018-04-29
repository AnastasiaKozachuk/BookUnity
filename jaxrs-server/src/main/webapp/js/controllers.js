angular.module('bookUnity')
  .controller('SetCtrl', ['$scope','$rootScope', '$http', function ($scope, $rootScope ,$http) {
      $scope.user = Object.assign({},$rootScope.user);
      $scope.done = function () {
          $http.post('/v2/account', { params: $scope.user },
            function (response) { console.log("success");},
            function (failure) { console.log("failed :(", failure); });
      }
  }]);

angular.module('bookUnity')
.controller('AddBookCtrl', ['$scope','$http', function ($scope ,$http) {
    $scope.book = {};
    $scope.done = function () {
        $http.post('/v2/book', { params: $scope.book },
          function (response) { console.log("success");},
          function (failure) { console.log("failed :(", failure); });
    }
}]);