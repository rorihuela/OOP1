//Reuben Orihuela
//CS 365
//10/15/17
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IVote {
	void showData() {
		System.out.println(Arrays.asList(Student.getMap()));
		// Data types
		int yes = 0, no = 0;

		// Options
		ArrayList<String> yL = new ArrayList<String>();
		yL.add("yes");

		ArrayList<String> nL = new ArrayList<String>();
		nL.add("no");


		// increments each time that option was chosen
		for (int i = 0; i <= Student.getMap().size()-1; i++) {
			System.out.println(Student.getMap().get(i));
			if (Student.getMap().get(i).equals(yL)) {
				yes++;
			} else if (Student.getMap().get(i).equals(nL)) {
				no++;
		}
		// Print out Results when done iterating through responses
		}
			System.out.println("Yes: " + yes);
			System.out.println("No: " + no);
		
	}
	void multiShowData() {
		System.out.println(Arrays.asList(Student.getMap()));
		// Data types
		int a = 0, b = 0, c = 0, d = 0, e = 0;

		// Options
		ArrayList<String> aL = new ArrayList<String>();
		aL.add("CS 140");

		ArrayList<String> bL = new ArrayList<String>();
		bL.add("CS 241");

		ArrayList<String> cL = new ArrayList<String>();
		cL.add("CS 356");

		ArrayList<String> dL = new ArrayList<String>();
		dL.add("CS 365");

		ArrayList<String> eL = new ArrayList<String>();
		eL.add("CS 480");

		// increments each time that option was chosen
		for (int i = 0; i <= Student.getMap().size()-1; i++) {
		
			 if (Student.getMap().get(i).equals (aL)) {
				a++;
			} else if (Student.getMap().get(i).equals (bL)) {
				b++;
			} else if (Student.getMap().get(i).equals (cL)) {
				c++;
			} else if (Student.getMap().get(i).equals (dL)) {
				d++;
			} else if (Student.getMap().get(i).equals (eL)) {
				e++;
			}
		}
	
			System.out.println("A: " + a);
			System.out.println("B: " + b);
			System.out.println("C: " + c);
			System.out.println("D: " + d);
			System.out.println("E: " + e);
	
	}	
}
