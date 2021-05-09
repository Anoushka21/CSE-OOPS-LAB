import java.io.*;
import java.util.Scanner;
class change
{
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
		insert(a,n);
		n=n+1;
		delete(a,n);

	}
	private static void insert(int a[],int n){
		System.out.println("enter element to be inserted and its position");
		Scanner s=new Scanner(System.in);
		int ele=s.nextInt();
		int pos=s.nextInt();
		int index=pos-1;
		int i;
		for( i=n;i>=index;i--)
		{
			a[i+1]=a[i];
		}
		a[index]=ele;
		System.out.println("the new array with inserted element is");
		for(i=0;i<n+1;i++)
		{
			System.out.print(a[i] + " ");
		}
	}
	private static void delete(int a[],int n)
	{
		System.out.println("enter position of element to be deleted");
		Scanner s=new Scanner(System.in);
		int del=s.nextInt();
		int index=del-1;
		int i;
		for(i=index;i<n;i++)
		{
			a[i]=a[i+1];
		}
		n=n-1;
		System.out.println("the new array after deleting element is");
		for(i=0;i<n;i++)
			System.out.print(a[i] + " ");
	}
}