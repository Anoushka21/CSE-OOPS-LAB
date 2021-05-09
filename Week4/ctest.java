import java.io.*;
import java.util.Scanner;
class Counter
{
	static int countob=0;

	static void showCount()
	{
		System.out.println("Number of static objects are " +countob);

	}
	Counter()
	{
		countob++;

	}

}
class ctest
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Counter c1=new Counter();
		Counter.showCount();
		Counter c2=new Counter();
		Counter c3=new Counter();
		Counter.showCount();
		
	}
}




