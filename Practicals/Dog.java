package corejava;

public class Dog extends Animals 
{
    //create constructer
	public Dog(int age) {
		super(age);
		
	}
	//Override tostring

	@Override
	public String toString() {
		return "Dog [age=" + age + "]";
	}

	
	

}
