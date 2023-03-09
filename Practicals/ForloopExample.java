package corejava;

import java.util.Scanner;

public class ForloopExample {

	public static void main(String[] args) {
		// creating a scanner class 
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of times you wanr to print 'HAPPY HOLI.....'");
        //creating variable using scanner class object 
        
        int number=sc.nextInt();
        for(int i=0;i<number;i++)
        {
        	System.out.println("HAPPY HOLI....");
        }
	}

	
}
