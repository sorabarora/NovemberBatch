package inheritance_with_Constructor;

public class Selenium extends Automation{
	
	public Selenium()
	{
		System.out.println("Child Default Constructor");
	}
	
	public Selenium(int a)
	{
		System.out.println("Child One Parameterized Constructor");
	}
	
	public Selenium(int a,int b)
	{
		System.out.println("Child Two Parameterized Constructor");
	}
	
	public static void main(String[] args) {
		
		Selenium s1=new Selenium(10,20);
	}

}
