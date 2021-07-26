var app = angular.module('myApp'["ngRuote"])
app.config(function($ruoteProvider){
	$ruoteProvider.when("/one",{
		templateUrl: "one.html",
        controller: "myCtrl"
	}).when("/two",{
		templateUrl: "two.html",
        controller: "myCtrl2"
})
})
app.controller('myCtrl',function($scope){
    $scope.msg = " I am from 1st controller"
})

app.controller('myCtrl2',function($scope){
    $scope.msg = " I am from 2nd controller"
})