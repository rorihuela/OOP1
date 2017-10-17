
//Reuben Orihuela
//CS 365
//10/15/17
//Single Question Class
import java.util.ArrayList;

class MultQuestion implements Question {
	// Data Values
	private String question;
	// list of possible answers to given question.
	private ArrayList<String> responses;

	// Constructors
	public MultQuestion(String question, ArrayList<String> responses) {
		this.question = question;
		this.responses = responses;
	}

	public MultQuestion(String question) {
		this.question = question;
		this.responses = null;
	}

	public MultQuestion(ArrayList<String> responses) {
		this.question = null;
		this.responses = responses;
	}
	// Constructors end

	public boolean isSingleChoice() {
		return false;
	}

	// getter for question and responses
	public String getQuestion() {
		return this.question;
	}

	public ArrayList<String> getResponses() {
		return this.responses;
	}
}
