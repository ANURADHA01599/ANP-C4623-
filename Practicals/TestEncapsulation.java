package corejava;

public class TestEncapsulation
{
   public static void main(String[] args)
   {
	   // creating object of class EncapsulationExample
	   EncapsulationExample a=new EncapsulationExample();
	   //object is used to accass the method of a class
	   a.setId(1);
	   a.setName("Anuradha");
		System.out.println("Id:"+a.getId()+"\n"+"Name:"+a.getName());
   }
  
}
