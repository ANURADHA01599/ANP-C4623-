package corejava;

import java.util.Scanner;

public class DoWHILE {

	public static void main(String[] args) {
	// Creating scanner class
		Scanner sc=new Scanner (System.in);
		int n;
		do
		{
			System.out.println("Enter a positive number.");
			n=sc.nextInt();
			
		}
		while(n<=0);
		
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
          System.out.println(n+"i="+fact);
	}

}
