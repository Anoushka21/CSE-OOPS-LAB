import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
class Student
{
	String month[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	int registration_num;
	String full_name;
	short semester;
	float gpa;
	float cgpa;
	GregorianCalendar gcal;
	Student()
	{
	registration_num=0;
	full_name="";
	gcal=new GregorianCalendar();
	semester=0;
	gpa=0.0f;
	cgpa=0.0f;
	}
	Student(int re, String fu, short se, int year, int month, int day, float gp, float cg)
	{
	registration_num=re;
	full_name=fu;
	gcal=new GregorianCalendar(year, month-1, day);
	semester=se;
	gpa=gp;
	cgpa=cg;
	}
	void display()
	{
		System.out.println("\n\nRegistration Number:"+registration_num);
		System.out.println("Name:"+full_name);
		System.out.println("Semester:"+semester);
		System.out.println("Date: "
                         + month[gcal.get(Calendar.MONTH)] + " "
                         + gcal.get(Calendar.DATE) + ", "
                         + gcal.get(Calendar.YEAR));
		System.out.println("GPA:"+gpa);
		System.out.println("CGPA:"+cgpa);
	}
	Student[] sortBySemester(Student array[])
	{
		Student obj;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(array[j].semester>array[j+1].semester)
				{
					obj=array[j];
					array[j]=array[j+1];
					array[j+1]=obj;
				}
			}
		}
		return array;
	}
	Student[] sortByCgpa(Student array[])
	{
		Student obj;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(array[j].cgpa>array[j+1].cgpa)
				{
					obj=array[j];
					array[j]=array[j+1];
					array[j+1]=obj;
				}
			}
		}
		return array;
	}
	Student[] sortByName(Student array[])
	{
		Student obj;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{
		        System.out.println("i:"+i+"\nj:"+j);
				if(((array[j].full_name).toLowerCase()).compareTo((array[j+1].full_name).toLowerCase())>0)
				{
					obj=array[j];
					array[j]=array[j+1];
					array[j+1]=obj;
				}
			}
		}
		return array;
	}
	void a3(Student array[],char required)
	{
		for(int i=0;i<5;i++)
		{
			if((array[i].full_name).charAt(0)==required)
				System.out.println(array[i].full_name);
		}
	}
	void b3(Student array[], String required)
	{
		for(int i=0;i<5;i++)
		{
			if((array[i].full_name).contains(required))
				System.out.println(array[i].full_name);
		}
	}
	void c3(Student array[])
	{
		for(int i=0;i<5;i++)
		{
			String temp=array[i].full_name;
			int lastspace=temp.lastIndexOf(' ');
			String result=temp.substring(lastspace+1,temp.length());
			for(int j=0;j<lastspace;j++)
			{
				result = result + " "+Character.toString(temp.charAt(j))+". ";
				while(temp.charAt(j)!=' ' )
					j++;
			}
			System.out.println(result);
		}
	}

}
class q1
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	Student array[]=new Student[5];
	for(int i=0;i<5;i++)
	{
	System.out.println("Student "+(i+1));
	int reg;
	String ful;
	short sem;
	int year,month,day;
	float gpa;
	float cgp;
	String trash;
	if(i>0)
	trash=sc.nextLine();
	System.out.print("Enter name of student:");
	ful=sc.nextLine();
	System.out.print("Enter year, month and date of joining:");
	year=sc.nextInt();
	month=sc.nextInt();
	day=sc.nextInt();
	System.out.print("Enter student number:");
	int num=sc.nextInt();
	reg=(year%100)*100+num;
	//Assuming 2 digit number
	System.out.print("Enter semester:");
	sem=(short)sc.nextInt();
	System.out.print("Enter gpa:");
	gpa=sc.nextFloat();
	System.out.print("Enter cgpa:");
	cgp=sc.nextFloat();
	System.out.println("\n");
	array[i]=new Student(reg,ful,sem,year,month,day,gpa,cgp);

}

	Student obj=new Student();
	System.out.println();
	Student newArray1[]=obj.sortBySemester(array);
	for(int i=0;i<5;i++)
	{
		System.out.println();
		newArray1[i].display();
	}
	System.out.println();
	System.out.println("\n************For 2a*************");
	Student newArray2[]=obj.sortBySemester(array);
	for(int i=0;i<5;i++)
	{
		System.out.println();
		newArray2[i].display();
	}
	Student newArray3[]=obj.sortByCgpa(array);
	for(int i=0;i<5;i++)
	{
		System.out.println();
		newArray3[i].display();
	}
	System.out.println();
	System.out.println("\n************For 2b*************");
	Student newArray4[]=obj.sortByName(array);
	for(int i=0;i<5;i++)
	{
		System.out.println();
		newArray4[i].display();
	}
	System.out.println();
	System.out.println("\n************For 3a*************");
	char req1;
	System.out.println("Enter the char:");
	req1=(sc.next()).charAt(0);
	obj.a3(array,req1);
	System.out.println();
	System.out.println("\n************For 3b*************");
	System.out.println("Enter the sequence of characters:");
	String req2=sc.next();
	obj.b3(array,req2);
	System.out.println();
	System.out.println("\n************For 3c*************");
	obj.c3(array);
}

}