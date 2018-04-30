var app = angular.module('bookUnity',
    ['ngRoute']).
    config(function ($locationProvider,$routeProvider) {
    		$locationProvider.hashPrefix('');
            $routeProvider.
                when('/catalog', {
                    templateUrl: '/partials/catalogPage.html'
                    //controller: 'CatalogCtrl'
                }).
                when('/about', {
                    templateUrl: '/partials/aboutPage.html'
                    //controller: 'AboutCtrl'
                }).
                when('/signin', {
                    templateUrl: '/partials/signinPage.html',
                    controller: 'signinCtrl',
                }).
                when('/signup', {
                    templateUrl: '/partials/signupPage.html'
                    //controller: 'SignupCtrl'
                }).
                when('/setup', {
                    templateUrl: '/partials/setAccountPage.html'
                    //controller: 'SetAccountCtrl'
                }).
                when('/dashboard', {
                    templateUrl: '/partials/accountPage.html',
                    controller: 'DashboardCtrl',
                }).
                when('/myBooks', {
                    templateUrl: '/partials/myBooksPage.html'
                    //controller: 'myBooksCtrl'
                }).
                when('/addBook', {
                    templateUrl: '/partials/addBook.html'
                    //controller: 'myBooksCtrl'
                }).
                when('/profile', {
                    templateUrl: '/partials/profilePage.html'
                    //controller: 'ProfileCtrl'
                }).
                when('/search', {
                    templateUrl: '/partials/homePage.html'
                }).
                when('/', {
                    templateUrl: '/partials/homePage.html'
                }).
                otherwise({
                    redirectTo: '/'
                });
        });
app.run(function($rootScope) {
	$rootScope.user = {};
	$rootScope.signed = false;
});

app.controller('DashboardCtrl', function ($rootScope, $scope,$timeout) {
	$timeout(function(){
		$rootScope.$apply(function(){
		    $rootScope.signed = true;
		    console.log("Signed in = " + $rootScope.signed);
		});
	});
}); 

app.controller('signinCtrl', function ($rootScope, $scope, $timeout) {
	$timeout(function(){
		$rootScope.$apply(function(){
		    $rootScope.signed = false;
		    console.log("Signed in = " + $rootScope.signed);
		});
	});
}); 
/*
app.controller("MenuCtrl", function ($scope, $rootScope, $location, Menu, Menu2, myService) {
	if (myService.getVal('signed') === 'false') {
		$scope.menu = Menu;
	}else{
		$scope.menu = Menu2;
	}
});

app.directive("menu", function () {
    return {
        restrict: "A",
        template:   '<a class="btn btn-link link-home" href="/#!/index.html" >'+
        			'<img class="img succulent" src="/img/BookUnity.svg">'+
        			'</a>' +
        			'<a href="{{item.href}}" ng-repeat="item in menu.items" class="{{item.class}}">{{item.name}}</a>'
    }

});

app.factory('myService', function () {
	var headInfo = [];
	headInfo['signed'] = 'false';
	return {
	    updateVal: function (key, data) {
	        headInfo[key] = data;
	    },
	    getVal: function (key) {
	        return headInfo[key];
	    }
	}
});

app.factory('Menu', function () {

    var Menu = {};

    Menu.items = [
        {
            class: "join",
            href: "#/signin",
            name: "JOIN",

        },

        {
            class: "menubutton",
            href: "#/about",
            name: "About",
        },

        {

            class: "menubutton",
            href: "#/search/#filters-search",
            name: "Search"

        },

        {

            class: "menubutton",
            href: "#/catalog",
            name: "Catalog"

        },

    ];

    return Menu;

});

app.factory('Menu2', function () {

    var Menu2 = {};

    Menu2.items = [
        {
            class: "join",
            href: "#/signin",
            name: "LOG OUT"

        },
        {

            class: "menubutton",
            href: "#/dashboard",
            name: "Profile"

        },

        {
            class: "menubutton",
            href: "#/about",
            name: "About"
        },

        {

            class: "menubutton",
            href: "#/search/#filters-search",
            name: "Search"

        },

        {

            class: "menubutton",
            href: "#/catalog",
            name: "Catalog"

        },

    ];

    return Menu2;

});*/
