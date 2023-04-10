package Pckg1;

public class cons {
public cons()
{
	this(11,11,11);
System.out.println("Default Constructor");
}
public cons(int a)
{
	this(10,10,10,10);
	System.out.println("one parameterized  Constructor");
}
public cons(int b, int c)
{
	this();
	System.out.println("Two parameterized  Constructor");
}
public cons(int d,int e,int f)
{
	System.out.println("three parameterized  Constructor");
	}
public cons(int g,int h,int i,int j )
{
	this(12,12);
	System.out.println("Four parameterized  Constructor");
}

 public static void main(String[] args) {
	cons ab=new cons(12);
	
}
}
