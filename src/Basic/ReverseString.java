package Basic;

import java.util.Scanner;

public class ReverseString {

	public static void main(String args[]){
		String str;		
		System.out.println("enter string");
		
		Scanner sc=new Scanner(System.in);
		 str=sc.nextLine();
		sc.close();
		String revstr=reverseString(str);
		System.out.println("reverse tring is :" +revstr);
		
		
	
	}

	public static String reverseString(String str) {
		if(str.isEmpty())
		return str;
	System.out.println(str.substring(1));
	System.out.println(str.charAt(0));
	return reverseString(str.substring(1))+str.charAt(0);
	}
}


		    

