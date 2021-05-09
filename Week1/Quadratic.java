import java.io.*;
import java.util.*;
import java.lang.Math;

class Quadratic{
	public static void main(String[] args){
		double a, b, c, disc;
		int flag;
		double x1,x2,u;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a");
		a=sc.nextDouble();
		System.out.println("enter b");
		b=sc.nextDouble();
		System.out.println("enter c");
		c=sc.nextDouble();
		disc=(b*b)-(4*a*c);
		u=Math.abs(Math.sqrt(disc));
		//System.out.println(disc);
		if(disc==0)
			flag=1;
		 else if(disc>0)
			flag=2;
		else
			flag=3;
		//System.out.println(flag);
		switch (flag)
		{
			case 1:
			{
				System.out.println("the roots are real and equal and are");
				x1=(-b)/(2*a);
				x2=x1;
				System.out.println(x1);
				System.out.println(x2);
				break;
			}
			case 2:
			{
				System.out.println("the roots are real and distinct and are");
				x1=((-b+u)/(2*a));
				x2=((-b-u)/(2*a));
				System.out.println(x1);
				System.out.println(x2);
				break;
				
			}
			case 3:
			{
				System.out.println("the roots are imaginary ");
				System.out.println("Root 1 = " + (b/(2*a)) + "+" + (u/(2*a)) + " i");
				System.out.println("Root 1 = " + (b/(2*a)) + "-" + (u/(2*a)) + " i");
				break;
			}
			default:{
				System.out.println("error");
				break;

			}
			
		}
		
		
		

	}
	
}