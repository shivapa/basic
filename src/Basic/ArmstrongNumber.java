package Basic;

import java.util.Scanner;

public class ArmstrongNumber {

	
/*	public static void main(String [] args){
		
		int num,number,total,temp=0;
		
		
		Scanner sc=new Scanner(System.in);
		
		num=sc.nextInt();
		
		number=num;
		
		sc.close();
		
		while(number!=0)
		{
			temp=number % 10;
			total=total+temp*temp*temp;
			
			number/=10;
			
			
		}
	
		if(total ==num)
			
			System.out.println(num+ "is an armstrong no");
		
		else
			
			System.out.println(num+ "is not an armstrong");
		
		
}
}*/

	 public static void main(String[] args) {

	        int num, number, temp, total = 0;
	        System.out.println("Ënter 3 Digit Number");
	        Scanner scanner = new Scanner(System.in);
	        num = scanner.nextInt(); 
	        scanner.close();
	        number = num;

	        while(number!=0)
	        {
	            temp = number % 10;
	            total = total + temp*temp*temp;
	            number /= 10;
	        }

	        if(total == num)
	            System.out.println(num + " is an Armstrong number");
	        else
	            System.out.println(num + " is not an Armstrong number");
	    }}