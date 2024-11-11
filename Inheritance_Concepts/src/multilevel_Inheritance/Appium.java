package multilevel_Inheritance;

public class Appium extends Selenium {
	
	public void method3()
	{
		System.out.println("Son Default Method");
		a=10;
	}
	
	public void display()
	{
		System.out.println("The value of a is "+a);
	}
	
	public static void main(String[] args) {
		
		Appium a1=new Appium();
		a1.method1();
		a1.method2();
		a1.method3();
		a1.display();
		a1.b=20;
		a1.c=30;
		System.out.println("The value of b is "+a1.b);
		System.out.println("The value of c is "+a1.c);
	}

}
