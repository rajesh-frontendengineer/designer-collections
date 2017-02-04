(function(){
	angular.module('boutiqueApp').factory('itemDataService',itemDataService);
	
	itemDataService.$inject = [];
	function itemDataService(){
		var serviceURL = "";
		
		function submitItemFormData(){
			
		}
		return{
			submitItemData:submitItemFormData
		}
		
	}	
})();