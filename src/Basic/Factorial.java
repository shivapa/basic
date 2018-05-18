package Basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String agrd[]){
		
		int fact=1;
		
		System.out.println("enter no.");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		sc.close();
		
		for(int i=1; i<=num; i++){
			
			fact=fact*i;
		}
		
		
		System.out.println("factorual is" +fact);
	}
}
