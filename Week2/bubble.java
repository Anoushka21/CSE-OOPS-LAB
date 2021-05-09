import java.io.*;
import java.util.Scanner;
class bubble
{
	private static  void bubblesort(int a[],int n)
	{
		int i,j,temp,ch;
		System.out.println("Enter 1 for ascending order and 2 for descending order");
		Scanner s= new Scanner(System.in);
		ch=s.nextInt();
		switch (ch){
			case 1:
			{
				for(i=0;i<n-1;i++){
					for (j=0;j<n-i-1;j++)
					{
						if(a[j]>a[j+1])
						{
							temp=a[j];
							a[j]=a[j+1];
							a[j+1]=temp;
						}
					}
				}
				System.out.println("the array in ascending order is");
				for(i=0;i<n;i++)
					System.out.print(a[i] + " ");
				break;
			}
			case 2:
			{
				for(i=0;i<n-1;i++)
				{
					for(j=0;j<n-1-i;j++)
					{
						if(a[j]<a[j+1])
						{
							temp=a[j];
							a[j]=a[j+1];
							a[j+1]=temp;
						}
					}
				}
				System.out.println("the array in descending order is");
				for(i=0;i<n;i++)
					System.out.println(a[i] + " ");
				break;
			}
			default:{
				System.out.println("Error");
				break;
			}
		}	
	
		
	}
	public static void main(String[] args){
		int a[]=new int[20];
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of elements");
		int n=s.nextInt();
		System.out.println("enter the elements");
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		bubblesort(a,n);

	}

}