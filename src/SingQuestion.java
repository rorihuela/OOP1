
//Reuben Orihuela
//CS 365
//10/15/17
//Single Question Class
import java.util.ArrayList;

class SingQuestion implements Question {
	// Data values
	private String question;
	// list of possible answers to given question
	private ArrayList<String> responses;

	// Constructors
	public SingQuestion(String question, ArrayList<String> responses) {
		this.question = question;
		this.responses = responses;
	}

	public SingQuestion(String question) {
		this.question = question;
		this.responses = null;
	}

	public SingQuestion(ArrayList<String> responses) {
		this.question = null;
		this.responses = responses;
	}
	// Constructor end

	public boolean isSingleChoice() {
		return true;
	}

	// getters for question and responses
	public String getQuestion() {
		return this.question;
	}

	public ArrayList<String> getResponses() {
		return this.responses;
	}

}
