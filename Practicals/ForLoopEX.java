package corejava;

import java.util.Scanner;

public class ForLoopEX {

	public static void main(String[] args) {
		Scanner  sc = new Scanner (System.in);
		System.out.println("ENTER the no. of time you want to print HAPPY HOLI.....");
		
		//CREATING variable using scanner class
		int number=sc.nextInt();
		for(int i=0; i<number; i++)
		{
			System.out.println("HAPPY HOLI....");
		}
		
		
		

	}

}
