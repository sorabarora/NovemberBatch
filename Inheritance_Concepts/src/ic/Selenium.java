package ic;

public class Selenium extends Automation{
	
	public void method2()
	{
		System.out.println("This is the son default method");
	}
	
	public static void main(String[] args) {
		
		Selenium s1=new Selenium();
		s1.method1();
		s1.method2();
		s1.abc=10;
		System.out.println(s1.abc);
	}

}
