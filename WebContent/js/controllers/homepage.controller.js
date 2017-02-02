(function(){
	angular.module('boutiqueApp').controller('homepageController',homepageController);
	
	homepageController.$inject = ["$scope"];
	function homepageController($scope){
		console.log("homepageController");
		$scope.page = "Home-Page"
	}
})();