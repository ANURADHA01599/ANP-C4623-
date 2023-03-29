package corejava;

import java.util.Scanner;

public class SwitchCaseEX {


	public static void main(String[] args) {
	//creating a scanner to take input from user
		Scanner sc= new Scanner(System.in);
		int n;
		do
		{
			System.out.println("1. Option 1");
			System.out.println("2. Option 2");
			System.out.println("3. Option 3");
			System.out.println("4. Optopn 4");
			System.out.println("Enter Your Choice");
			n=sc.nextInt();
			
			switch👎
			{
             case 1:
			    System.out.println("You Selected Optopn 1.");
		    	break;
             case 2:
    			System.out.println("You Selected Optopn 2.");
    			break;
             case 3:
    			System.out.println("You Selected Optopn 3.");
    			break;
             case 4:
    			System.out.println("Exit the option");
    			break;
    		 default:
    			System.out.println("Invalid choice,please try again.....");
			
		}

	}
     while(n!=4);
}
}