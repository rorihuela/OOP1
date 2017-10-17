//Reuben Orihuela
//CS 365
//10/15/17
//Question interface

//Using multiple objects from java's utility library
import java.util.*;
 class Student {
	 //Data Values
	 private int ID;
	 private ArrayList <String> responses;
	 private static HashMap <Integer, ArrayList<String>> mapResponses =
			 new HashMap <Integer, ArrayList <String>>();
	 
	 //Constructor
	 public Student(int ID){
		 this.ID = ID;
	 }
	 
	 //Getter methods
	 public int getID(){
		 return ID;
	 }
	 
	 public ArrayList <String> getResponses(){
		 return responses;
	 }
	 
	 public static HashMap<Integer, ArrayList<String>> getMap(){
		 return mapResponses;
	 }
	 //Getter methods end
	 
	 
	 public void sendResponses(Question questionChoice){
		 if (questionChoice.isSingleChoice()){
				responses = new ArrayList<String>(questionChoice.getResponses());
				//Serve to randomize answers, and only provide one answer
				Collections.shuffle(responses);
				responses.remove(0);
			 mapResponses.put(getID(), responses);
		 }
		 else{
			 responses = new ArrayList<String>(questionChoice.getResponses());
			 //Serves to randomize answers and amount of answers
				Collections.shuffle(responses);				
				int removeRandom;
				removeRandom = (int)(new Random().nextInt(responses.size()) - 1);				
				for (int i = 0; i < removeRandom; i++) {
				 responses.remove(i);
			 }
			 for (int i = 0; i < responses.size(); i++){
				 if (responses.get(i)!=null){
					 			 mapResponses.put(getID(), responses);

				 }
			 }
		 }
		 Collections.sort(responses);
	 }
	 
	 

}