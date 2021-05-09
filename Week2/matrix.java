import java.io.*;
import java.util.Scanner;
class matrix
{
	public static void main(String[] args)
	{
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int c[][]=new int[10][10];
		int m,n;
		int i,j;
		System.out.println("enter no. of rows and columns");
		Scanner s=new Scanner(System.in);
		m=s.nextInt();
		n=s.nextInt();
		System.out.println("enter elements of first matrix");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
				a[i][j]=s.nextInt();
		}
		System.out.println("enter elements of second matrix");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
				b[i][j]=s.nextInt();
		}
		c=add(a,b,m,n);
		System.out.println("the resultant matrix is");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(c[i][j] + "\t");
					
			}
			System.out.println();
		}


	}
	private static int[][] add( int a[][], int b[][],int r,int c ){
		int res[][]=new int[10][10];
		int i,j;
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				res[i][j]=a[i][j] + b[i][j];
			}
		}
		return res;
	}
}