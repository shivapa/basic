package Basic;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		  String str, rev = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
	 sc.close();
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
//to print rev h
	    
	      // System.out.println(rev);
	     
	    
		
/*
 *
 
		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(str.length() - (i+1));

			//if (c == str.charAt(str.length() - (i+1)) ) {
				sc = sc + c;
			//}
		}v
		if(str.equals(sc)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	System.out.println(sc);
	}*/
}}
