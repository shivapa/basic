package Basic;

import java.util.Scanner;

public class Alphanumeric {

	public static void main(String args[]) {

		String str;
		String s = "";
		int sum = 0;

		System.out.println("enter sreing");

		Scanner sc = new Scanner(System.in);

		str = sc.nextLine();

		sc.close();

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (Character.isDigit(c)) {

				s = s + c;

			}

			else {

				if (s != "")

					sum = sum + Integer.parseInt(s);
				s = "";
			}

		}

		if (s != "") 
			sum = sum + Integer.parseInt(s);

			System.out.println("total" + sum);
		
	}

}
