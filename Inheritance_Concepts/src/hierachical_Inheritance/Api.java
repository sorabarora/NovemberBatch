package hierachical_Inheritance;

public class Api extends Automation {
	
	public void method3()
	{
		System.out.println("Son2 Class");
	}
	
	public static void main(String[] args) {
		
		Api a1=new Api();
		a1.method1();
		a1.method3();
		a1.a=20;
		System.out.println("The value of a is "+a1.a);
		
		
	}

}
