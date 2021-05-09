import java.io.*;
import java.util.Scanner;
class linear{
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
		search(a,n);
	}
	public static void search(int a[],int n)
	{
		System.out.println("enter the element to be searched");
		Scanner s=new Scanner(System.in);
		int ele=s.nextInt();
		int i,flag=0;
		for(i=0;i<n;i++)
		{
			if(a[i]==ele)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("the element " + ele + " is found at position " +(i+1));
		}
		else
			System.out.println("the element " + ele + " is not found");
	}
}