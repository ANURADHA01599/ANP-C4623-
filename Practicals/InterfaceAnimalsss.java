package corejava;

interface Animalsss 
{
public static void sound();
	//Interface method without body
}
class Monkey implements Animalsss
	//creating class monkey
{
  public void sound()
		//body of interface method
        {
			System.out.println("Monkey......");
		}
	}
class Main1
    //creating class with main method
	
{
		public static void main(String[] args) 
		{
		Monkey m=new Monkey();
		m.sound();
		//calling method of interface
}
