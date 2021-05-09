import java.io.*;
import java.util.Scanner;
import java.lang.Math;
class TIME
{
	int hr;
	int min;
	int sec;
	TIME()
	{
		hr=0;
		min=0;
		sec=0;
	}
	TIME(int hr,int min,int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	public static TIME assign()
	{
		TIME t1=new TIME();
		System.out.println("enter time in hh:mm:ss format");
		Scanner s=new Scanner(System.in);
		t1.hr=s.nextInt();
		t1.min=s.nextInt();
		t1.sec=s.nextInt();
		return t1;
	}
	public static void display(TIME t2)
	{
		if(t2.sec > 60)
		{
			t2.min+=1;
			t2.sec=t2.sec-60;
		}
		if(t2.min>60)
		{
			t2.min-=60;
			t2.hr+=1;
		}
		if(t2.hr>24)
		{
			System.out.println(" Error.Enter in 24 hour format");
		}
		System.out.println("the time is " + t2.hr + ":" + t2.min + ":" +t2.sec);

	}

}
class time2
{
	public static void main(String[] args)
	{
		TIME t1=new TIME();
		TIME.display(t1);
		System.out.println("enter time in hh:mm:ss format");
		Scanner s=new Scanner(System.in);
		int hr=s.nextInt();
		int min=s.nextInt();
		int sec=s.nextInt();
		TIME t2=new TIME(hr,min,sec);
		TIME.display(t2);
	}
}