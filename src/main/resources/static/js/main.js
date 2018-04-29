var app = angular.module('app', []);

app.config( function ($httpProvider) {
$httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
});

app.controller('indexController', ['$scope','$http', function($scope, $http) {
	var self= this;
	self.login = function () {
	$http.get('/greeting', {
			headers : { authorization : "Basic "
						+ btoa(self.credentials.username
						+ ":" + self.credentials.password)
					}
		}) .then( function (response) {
			self.greeting = response.data;
			self.hide = true;
		})
	}

	self.refresh = function(){
		$http.get("/greeting").then(function(response){
			self.greeting = response.data;
		})
	}
	
	self.logout = function(){
		$http.post("/logout").then(function(){
			self.hide = false;
			self.greeting = {};
		});
	}
	
	
}]);