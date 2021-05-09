import java.io.*;
import java.util.*;

class Largest{
	public static void main(String[] args)
	{
	int a,b,c,res;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a:");
	a=sc.nextInt();
	System.out.println("enter b:");
	b=sc.nextInt();
	System.out.println("enter c:");
	c=sc.nextInt();
	res=large(a,b,c);
	System.out.println("the largest is");
	System.out.println(res);
	}

	private static int large(int x, int y,int z){
		if(x>y && x>z)
			return x;
		else if (y>z)
			return y;
		else
			return z;
	}
}