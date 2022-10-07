package tp04;

public class condition3 {

	public static void main(String[] args) {
		int p1 = 8, p2 = 9, p3 = 7, median;

		if (p1 < p2) {
			if (p3 < p1)
				median = p1; // p3 < p1 < p2
			else {
				if (p2 < p3)   //  p1 > p2 > p3
					median = p2;
				else
					median = p1; // p1 < p2 > p3

			}

		} else {        // p1 > p2
			if (p3 < p2)
				median = p2;     // p1 > p2 > p3
			else {
				if (p1 > p3)
					median = p3;  // p1 > p2  et p3 > p2 et P1 >p3
				else
					median = p1;    // p3 > p1 > p2  

			}

		}

		System.out.println(median);

	}

}
