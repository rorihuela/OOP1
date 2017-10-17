//Reuben Orihuela
//10/17/17
//Project 1
import java.util.*;
import java.util.Random;

public class SimulationDriver {
	public static void main(String[] args) {
		// Ask user which type of question theyd like to have
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter '0' for single choice questions and '1' for multiple choice questions: ");
		int userChoice = kb.nextInt();

		// Example of a single Choice Question
		ArrayList<String> singleResponses = new ArrayList<>();
		String question = "Do you like CS?";
		singleResponses.add("yes");
		singleResponses.add("no");
		SingQuestion single = new SingQuestion(question, singleResponses);

		// Example of a Multiple Choice Question
		ArrayList<String> multiResponse = new ArrayList<String>();
		String multiQuestion = "Which CS classes are you taking this quarter?";
		multiResponse.add("CS 140");
		multiResponse.add("CS 356");
		multiResponse.add("CS 480");
		multiResponse.add("CS 365");
		multiResponse.add("CS 241");
		Question multi = new MultQuestion(multiQuestion, multiResponse);
		Question questionType[] = new Question[2];
		Question questionChoice;
		questionType[0] = single; 
		questionType[1] = multi;
		questionChoice = questionType[userChoice];		

		Random rd = new Random();
		int size = rd.nextInt(60);
		Student student[] = new Student[size];
		for (int i = 0; i < size; i++) {
			student[i] = new Student(i);
		}
		System.out.println("\nQuestion: " + questionChoice.getQuestion());
		System.out.println("\nResults: ");
		for (int i = 0; i < size; i++) {
			student[i].sendResponses(questionChoice);
			System.out.println("Student " + student[i].getID() + " responded: " + student[i].getResponses());
		}
		
		//Creates iVote object (different behavior for double or singleQuestion)
		IVote vote = new IVote();

		System.out.println("\nTotal results:");
		if (userChoice == 0)
		vote.showData();
		else 
		vote.multiShowData();	
		
		

	}
}
