import java.io.*;
import java.util.*;

class prime{
	public static void main(String[] args){
		int n,num,res;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		res=isPrime(n);
		if(res==1){
			System.out.print(n);
			System.out.println(" is prime");
			
		}
		else{
			System.out.print(n);
			System.out.println(" is not prime");
		}
		//System.out.println("enter number to generate prime no list");
		//num=sc.nextInt();
		

	}
	private static int isPrime(int x){
		int i,flag=0;
		for(i=2;i<=x;i++)
		{
			if(x%i==0)
				flag+=1;
		}
		return(flag);
	}

}
