package corejava;

 class person {
  //method
   public void name()
	 {
		 System.out.println("ABHIJEET");
	 }
    public void age()
	 {
		 System.out.println(19);
	 }
  }
 // student class
 class student extends person{
	 
      public void StudentId()
       {
    	 System.out.println(8);
       }
      public void major()
     {
    	 System.out.println("join army");
     }
  }
//graguate class
 class graguate extends student
 {
 public void advisor()
     {
    	 System.out.println("ARPIT CHAUDHARI");
     }
 public void thesisTopic()
     {
    	 System.out.println("military research");
     }
 }
 class success
 {
	 public static void main (String[]args)
	 {
		 graguate s=new graguate();
		 s.name();
		 s.age();
		 s.StudentId();
		 s.major();
		 s.advisor();
		 s.thesisTopic();
	 }
 }
 
   
