package corejava;

public class Cat extends Animals {
	//create constructer

	public Cat(int age) {
		super(age);
		
	}
	// override to string

	@Override
	public String toString() {
		return "Cat [age=" + age + "]";
	}
	

}
