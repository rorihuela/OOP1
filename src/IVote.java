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
		for (int i = 1; i <= Student.getMap().size(); i++) {
			if (Student.getMap().get(i) == (yL)) {
				yes++;
			} else if (Student.getMap().get(i) == (nL)) {
				no++;
		}
		// Print out Results when done iterating through responses
		//if (Question.isSingleChoice()) {
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
		aL.add("A");

		ArrayList<String> bL = new ArrayList<String>();
		bL.add("B");

		ArrayList<String> cL = new ArrayList<String>();
		cL.add("C");

		ArrayList<String> dL = new ArrayList<String>();
		dL.add("D");

		ArrayList<String> eL = new ArrayList<String>();
		eL.add("E");

		// increments each time that option was chosen
		for (int i = 1; i <= Student.getMap().size(); i++) {
		
			 if (Student.getMap().get(i) == (aL)) {
				a++;
			} else if (Student.getMap().get(i) == (bL)) {
				b++;
			} else if (Student.getMap().get(i) == (cL)) {
				c++;
			} else if (Student.getMap().get(i) == (dL)) {
				d++;
			} else if (Student.getMap().get(i) == (eL)) {
				e++;
			}
		}
	
			System.out.println("A: " + a);
			System.out.println("B: " + b);
			System.out.println("C: " + c);
			System.out.println("D: " + d);
			System.out.println("E: " + e);
	//0	}

	
	}	
}
