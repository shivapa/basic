package Basic;

import java.util.Scanner;

public class ResvesreNumber {

	public static void main(String args[])

	{

		int reverseNum = 0;
		int num = 0;
		System.out.println("enter number");

		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();
		sc.close();

		while (num != 0) {

			reverseNum = reverseNum*10;
			reverseNum = reverseNum + num%10;
			num = num/10;

		}

		System.out.println("reverse no is" + reverseNum);

	}

}
