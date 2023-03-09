package corejava;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		//creating scanner class to take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		//creating variable using scanner class object
		int number=sc.nextInt();
	
		//checking condition
		if(number>0)
		{
			System.out.println("The number is positive");
		}
		else if(number<0)
		{
			System.out.println("The number is negative");
		}
		else
		{
			System.out.println("The number is zero");
		}
		sc.close();
		

	}

}
