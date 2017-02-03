"use strict";

(function(){
    angular.module('boutiqueApp').config(appConfig);

function appConfig($routeProvider,$locationProvider,$compileProvider){
    $locationProvider.html5Mode(false);
    $locationProvider.hashPrefix('');
    
    $routeProvider.when('/admin',{
        templateUrl:'/collections/templates/admin/admin.html',
        controller:'adminController',
        controllerAs:'adminCtrl'
    }).when('/homepage',{
        templateUrl:'/collections/templates/homepage/homepage.html',
        controller:'homepageController',
        controllerAs:'homeCtrl'
    }).when('/',{
        templateUrl:'/collections/templates/homepage/homepage.html',
        controller:'homepageController',
        controllerAs:'homeCtrl'
    }).otherwise({
        templateUrl:'/collections/templates/homepage/hompage.html',
        controller:'homepageController',
        controllerAs:'homeCtrl'
    })
}
    
})();


