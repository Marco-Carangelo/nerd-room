//Get the elements from the dom
//Elements for the comment edit function
const commentDisplay = document.getElementById('comment-display');
const editBtn = document.getElementById('edit-btn');
const formMovie = document.getElementById('form-movie');

//Elements for the rating attribute selection
const categorySelect = document.getElementById('category-select');
const attributeSelect = document.getElementById('attribute-select');
const attributeField = document.getElementById('attribute-field'); 
const datalistInput = document.getElementById('datalist-input');
const attributesSearch = document.getElementById('attributes-search')
let lastSelectedCategory = 0;

////Function to change visibility to paragraph and text area of the comment section when the edit button is clicked
//editBtn.addEventListener('click', function(event){
//	event.preventDefault();
//	
//	//Hide the paragraph element and show the form with textarea to consent the text editing
//	commentDisplay.classList.add('visually-hidden');
//	formMovie.classList.remove('visually-hidden');
//	
//})

//Function change visibility to the attribute select and to populate it with option matching the selected id
categorySelect.addEventListener('change', function(event){
	event.preventDefault();
	
	//Remove the visually-hidden attribute to the attribute-field element
	attributeField.classList.remove('visually-hidden');
	
	//If another category has been selected before, restore the visually hidden class
	if( lastSelectedCategory != 0){
		document.getElementById('category-individual-' + lastSelectedCategory ).classList.add('visually-hidden');
	}
		
	//Get the selected category value(id)
	const categoryId = categorySelect.value;
	//Get the id of the select relative to the selected category and turn it visible
	const selectedCat = document.getElementById('category-individual-' + categoryId ); 
	selectedCat.classList.remove('visually-hidden');
	//Store the id of the category as the last selection of the user
	lastSelectedCategory = categoryId;
	
	
	attributeField.addEventListener("change", function(e){
		//Get the value of the id and the text from select element
		const selectionId = selectedCat.value;
		const selectionTxt = selectedCat.options[selectedCat.selectedIndex].text;
		//console.log(selectionTxt);
		setRatingForm(selectionTxt, selectionId);
		
		e.stopPropagation();
	});
});

//Function to pass the searched by datalist attribute to the Rating creation form
datalistInput.addEventListener('change', function(){

	//Get the value of the datalist input
	const selectionTxt = datalistInput.value;
	//Get the id of the datalist input
	const selectionId = attributesSearch.options.namedItem(datalistInput.value).dataset.id
	
	setRatingForm(selectionTxt, selectionId);
	
})

//Function to set readonly attribute name and mediaAttribute id fields in the rating create form
function setRatingForm(txt, id){
	document.getElementById("attribute-readonly").value = txt;	
	document.getElementById("rating-attribute-id").value = id;
}