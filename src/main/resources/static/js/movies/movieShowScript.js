//Get the element from the dom

const commentDisplay = document.getElementById('comment-display');
const editBtn = document.getElementById('edit-btn');
const formMovie = document.getElementById('form-movie');


//Function to change visibility to paragraph and text area of the comment section when the edit button is clicked
editBtn.addEventListener('click', function(event){
	event.preventDefault();
	
	//Hide the paragraph element and show the form with textarea to consent the text editing
	commentDisplay.classList.add('visually-hidden');
	formMovie.classList.remove('visually-hidden');
	
})