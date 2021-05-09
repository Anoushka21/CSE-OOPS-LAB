import java.io.*;
import java.util.Scanner;

class Student
{
	int reg;
	String name;
	GregorianCalendar doj;
	short sem;
	float gpa;
	float cgpa;

	Student()
	{
		reg=0;
		name="abc";
		doj= new GregorianCalendar();
		sem=0;
		gpa=0;
		cgpa=0;
	}
	Student(Student s)
	{
		this.reg=s.reg;
		this.name=s.name;
		this.doj=s.doj;
		this.sem=s.sem;
		this.gpa=s.gpa;
		this.cgpa=s.cgpa;
	}
	public void display(Student s)
	{
		System.out.println("Reg no:" +s.reg);
		System.out.println("name: " +s.name);
		System.out.println("Date of joining:" +s.doj);
		System.out.println("Semester:" +s.sem);
		System.out.println("gpa:" +s.gpa);
		System.out.println("cgpa" +s.cgpa);
	}
	public void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name");
		name=s.nextLine();
		System.out.println("Enter doj(YYYY/MM/DD");
		doj=new GregorianCalendar(s.nextInt(),s.nextInt()-1,s.nextInt());
		System.out.println("Enter semester");
		sem=s.nextShort();
		System.out.println("Enter gpa");
		gpa=s.nextFloat();
		System.out.println("Enter cgpa");
		cgpa=s.nextFloat();

	}
}

class Students
{
	Student students[];
	int n;
	public Students(int n)
	{
		this.n=n;
		this.students=new Student[n];
	}

	public void Allinput()
	{
		int i;
		for(i=0;i<n;i++)
		{
			students[i]=new Student();
			students[i].input();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yy");
            String reg = dateFormat.format(students[i].dateJoined.getTime());
            students[i].reg+= String.format( "%02d", i+1);
            students[i].reg = Integer.parseInt(students[i].reg);
		}
	}
	public void DispAll()
	{
		for(int i=0;i<n;i++)
		{
			students[i].display();
		}
	}
}

class Driver
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of records");
		int n=s.nextInt();
		Students students=new Students[n];
		students.Allinput();
		students.DispAll();
	}
}