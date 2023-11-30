package package1;

public class student //Class Name - student

{ // {} indicates the boundary of the class
	int rollno; // rollno variable that will store integer value
	int age;
	
	public void display1() //method name - display1 () indicate method
	
	{ // {} indicate the boundary of method
		
		System.out.println("Welcome to all of you");
		
	}
	
	public void display2() 
	{
		System.out.println("Automation is very easy");
		
	}
	
	public static void main(String[] args) 
	{
		student kumar=new student(); //classname referencevar= new classname
		kumar.display1(); //calling method --display1
		kumar.rollno=1256; // calling variable -- rollno
		System.out.println("The roll no of kumar is "+kumar.rollno);
		
		kumar.display2(); // calling method --display2
		kumar.age=18;
		System.out.println("The age of kumar is "+kumar.age);
		
	}

}
