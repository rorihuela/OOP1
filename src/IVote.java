
//Reuben Orihuela
//CS 365
//10/15/17
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IVote {
	void showData() {
		// Data Values for single
		int yes = 0, no = 0;

		// Options
		ArrayList<String> yL = new ArrayList<String>();
		yL.add("yes");

		ArrayList<String> nL = new ArrayList<String>();
		nL.add("no");

		// increments each time that option was chosen
		for (int i = 0; i <= Student.getMap().size() - 1; i++) {
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
		// Data types for multi
		int a = 0, b = 0, c = 0, d = 0, e = 0;

		// Options
		String aL = "CS 140";

		String bL = "CS 241";

		String cL = "CS 356";

		String dL = "CS 365";

		String eL = "CS 480";

		// increments each time that option was chosen
		// Compares each value of each array to Data listed above
		for (int i = 0; i <= Student.getMap().size() - 1; i++) {
			for (int j = 0; j < Student.getMap().get(i).size(); j++) {
				if (Student.getMap().get(i).get(j).equals(aL)) {
					a++;
				} else if (Student.getMap().get(i).get(j).equals(bL)) {
					b++;
				} else if (Student.getMap().get(i).get(j).equals(cL)) {
					c++;
				} else if (Student.getMap().get(i).get(j).equals(dL)) {
					d++;
				} else if (Student.getMap().get(i).get(j).equals(eL)) {
					e++;
				}
			}
		}

		System.out.println("CS 140: " + a);
		System.out.println("CS 241: " + b);
		System.out.println("CS 356: " + c);
		System.out.println("CS 365: " + d);
		System.out.println("CS 480: " + e);

	}
}
