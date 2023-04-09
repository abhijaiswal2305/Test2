 package Pckg1;

public class Class1 {
	int a;
	public void test()
	{
				System.out.println("Hello all");
	}
	
	public static void main(String[] args) {
		Class1 ab= new Class1();
		ab.test();
		ab.a=100;
		System.out.println(ab.a);
	}

}
