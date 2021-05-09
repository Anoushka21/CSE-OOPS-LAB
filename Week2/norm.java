import java.io.*;
import java.util.Scanner;
class norm
{
	public static void main(String[] args)
	{
		int a[][]=new int[10][10];
		int m,n,i,j;
		System.out.println("enter no. of rows and columns");
		Scanner s=new Scanner(System.in);
		m=s.nextInt();
		n=s.nextInt();
		System.out.println("enter elements of matrix");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
				a[i][j]=s.nextInt();
		}
		tr(a,m);
		nr(a,m,n);
	}
	private static void tr(int a[][],  int r)
	{ 
		int trace=0;
		int i;
		for(i=0;i<r;i++)
		{
			trace=trace+a[i][i];
		}
		System.out.println("the trace of matrix is " + trace);
	}
	private static void nr(int a[][],int m,int n)
	{
		int res=0;
		int i,j;
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				res= res +(a[i][j]*a[i][j]);
			}
		}
		System.out.println("the norm is " +res);

	}
}
