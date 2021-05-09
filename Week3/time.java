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
			TIME t3=new TIME();
			t3=assign();
		}
		System.out.println("the time is " + t2.hr + ":" + t2.min + ":" +t2.sec);

	}
	public static TIME add(TIME t1,TIME t2)
	{
		TIME t3=new TIME(t1.hr+t2.hr,t1.min+t2.min,t1.sec+t2.sec);
		if(t3.sec > 60)
		{
			t3.min+=1;
			t3.sec-=60;
		}
		if(t3.min>60)
		{
			t3.min-=60;
			t3.hr+=1;
		}
		if(t3.hr>24)
		{
			t3.hr=t3.hr%24;
		}
		return t3;
	}
	public static TIME subtract(TIME t1,TIME t2)
	{
		TIME t3=new TIME(Math.abs(t1.hr-t2.hr),Math.abs(t1.min-t2.min),Math.abs(t1.sec-t2.sec));
		if(t3.sec > 60)
		{
			t3.min+=1;
			t3.sec-=60;
		}
		if(t3.min>60)
		{
			t3.min-=60;
			t3.hr+=1;
		}
		if(t3.hr>24)
		{
			t3.hr=t3.hr%24;
		}
		return t3;

	}

}
class time
{
	public static void main(String[] args)
	{
		TIME t1=new TIME();
		t1=TIME.assign();
		TIME.display(t1);
		TIME t2=new TIME();
		t2=TIME.assign();
		TIME.display(t2);
		TIME t3=new TIME();
		TIME t4=new TIME();
		t3=TIME.add(t1,t2);
		t4=TIME.subtract(t1,t2);
		System.out.println("Addition:");
		TIME.display(t3);
		System.out.println("Difference:" );
		TIME.display(t4);



	}
}