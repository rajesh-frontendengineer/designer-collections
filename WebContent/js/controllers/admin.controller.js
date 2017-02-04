(function(){
	angular.module('boutiqueApp').controller('adminController',adminController);
	
	adminController.$inject = [];
	function adminController(){
		console.log("adminController");
		var vm = this;
		vm.page = "AdminPage";



		/*Submit Button for S3 Image Upload Service*/
		vm.S3ImageAWSButton = function(){

		}

	}
})();