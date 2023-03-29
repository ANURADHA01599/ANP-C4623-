package corejava;

import java.util.Scanner;

public class WhileEX {

	public static void main(String[] args) {
		// Creating Scanner to take input
		Scanner sc = new Scanner (System.in);
		int a;
		System.out.println("ENTER A NUMBER BETWEEN 1 TO 10");
		a=sc.nextInt();
		while(a<1||a>10)
		{
			System.out.println("invalid input please enter no. between 1 and 10");
			System.out.println("enter a number between 1 to 10");
			a=sc.nextInt();
			
		}
		System.out.println("You enter a number."+a);
		

	}

}
