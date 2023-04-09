package Pckg1;

public class class2 {
	//((((10+2)+2)-2)*2)/2)//((((10*2)-2)+2)-2)/2)
	int sum(int a, int b) 
	{	int c;
		c=a+b;
		//System.out.println("Sum is "+c);
		return c;
	}
	int sub(int d, int e)
	{	int f;
		f=d-e;
		//System.out.println("sub is"+f);
		return f;
	}
	int mul(int g, int h)
	{
		int i=g*h;
		//System.out.println("mul is"+i);
		return i;
	}
	int div(int j, int k)
	{
		int l=j/k;
		//System.out.println("div is"+l);
		return l;
	}
	public static void main(String[] args) {
		class2 ab= new class2();
		int z=ab.sum(10, 2);
		int x=ab.sum(z, 2);
		int y=ab.sub(x, 2);
		int y1=ab.mul(y, 2);
		int z1=ab.div(y1, 2);
		System.out.println("result"+z1);
				
	}
}
