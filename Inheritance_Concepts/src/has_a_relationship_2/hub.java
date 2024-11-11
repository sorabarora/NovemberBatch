package has_a_relationship_2;

import has_a_relationship_1.Dt;

public class hub {
	
	public void method3()
	{
		System.out.println("Child default method");
	}
	
	public void method4(int b)
	{
		System.out.println("Child one parameterized method ");
	}

	public static void main(String[] args) {
		
		Dt d1=new Dt(); // has a relationship
		d1.method1();
		d1.method2(10);
		hub h1=new hub();
		h1.method3();
		h1.method4(20);
		
		
		

	}

}
