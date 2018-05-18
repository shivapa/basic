package Basic;

import java.util.Scanner;

public class StringExample {

	public static void main(String args[]) {

		String str;
		String s = "";
		int sum = 0;
		int i = 0;
		System.out.println("enetr String.");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		sc.close();
		// for (int i = 0; i < str.length(); i++) {

		while (i < str.length()) {
			char c = str.charAt(i);
			i++;
			if (Character.isDigit(c)) {
				s = s + c ;
				
			} else {

				if (s != "")

					sum = sum + Integer.parseInt(s);
				s = "";

			}

		}

		if (s != "")
			sum = sum + Integer.parseInt(s);
		System.out.println("final sum is " + sum);

	}
}
