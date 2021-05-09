import java.io.*;
import java.util.Scanner;
class primearray{
	public static void main(String[] args)
	{
		int a[]=new int[20];
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of elements");
		int n=s.nextInt();
		System.out.println("enter the elements");
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		System.out.println("the prime numbers in array are");
		for(i=0;i<n;i++)
		{
			if(prime(a[i])==1)
				System.out.print(a[i] + " ");
		}

	}
	private static int prime(int x){
		int i,flag=0;
		for(i=2;i<=x;i++)
		{
			if(x%i==0)
				flag=flag+1;
		}
		return flag;
	}
}