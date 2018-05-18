package Basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String args[]) {
		int var = 0;
		boolean isPrime = true;

		System.out.println("enrter no. :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		sc.close();

		for (int i = 2; i <= num / 2; i++)

		{

			var = num % i;

			if (var == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {

			System.out.println("no. is prime");
		}

		else {

			System.out.println("not a prime no.");
		}
	}
}
