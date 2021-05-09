import java.io.*;
import java.util.Scanner;
class COMPLEX
{
	float real;
	float imag;

	COMPLEX()
	{
		real=0;
		imag=0;
	}
	COMPLEX(float real,float imag)
	{
		this.real=real;
		this.imag=imag;
	}
	 public static void display(COMPLEX c1)
	{
		System.out.println("The complex no entered is " + c1.real 
			+ " +" + c1.imag + "i");

	}
	public static COMPLEX assign()
	{
		COMPLEX c2= new COMPLEX();
		System.out.println("enter the complex no ");
		Scanner s= new Scanner(System.in);
		c2.real=s.nextFloat();
		c2.imag=s.nextFloat();
		return c2;
	}
	public static COMPLEX add(COMPLEX c1,COMPLEX c2)
	{
		COMPLEX c3=new COMPLEX(c1.real+c2.real,c1.imag+c2.imag);
		return c3;

	}
	public static COMPLEX subtract(COMPLEX c1,COMPLEX c2)
	{
		COMPLEX c3=new COMPLEX(c1.real-c2.real,c1.imag-c2.imag);
		return c3;
	}


}
class complex
{
	public static void main(String[] args)
	{
		COMPLEX c1=new COMPLEX();
		c1=COMPLEX.assign();
		COMPLEX.display(c1);
		COMPLEX c2=new COMPLEX();
		c2=COMPLEX.assign();
		COMPLEX.display(c2);
		COMPLEX c3=new COMPLEX();
		COMPLEX c4= new COMPLEX();
		c3=COMPLEX.add(c1,c2);
		c4=COMPLEX.subtract(c1,c2);
		System.out.println("the sum of the numbers is " + c3.real + " + " + c3.imag + "i" );
		System.out.println("the sum of the numbers is " + c4.real + " + " + c4.imag + "i" );

	}
}
