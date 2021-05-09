import java.io.*;
import java.util.*;

class factorial{
	public static void main(String[] args){
		int n,res,res2,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		res=fact(n);
		System.out.println("the factorial is");
		System.out.println(res);
		System.out.println("enter r");
		r=sc.nextInt();
		res2=(fact(n))/((fact(r))*(fact(n-r)));
		System.out.println("nCr is");
		System.out.println(res2);
		

	}
	private static int fact(int num){
		int i,result=1;
		for(i=1;i<=num;i++)
			result=result*i;
		return(result);
	}
}