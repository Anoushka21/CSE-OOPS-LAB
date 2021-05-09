import java.io.*;
import java.util.Scanner;
class BANKACCOUNT
{
	String name;
	int accno;
	String type;
	int balance;
	static int roy;
	Scanner s=new Scanner(System.in);

	BANKACCOUNT()
	{
		name="Abc";
		accno=0;
		type="savings";
		balance=0;
		roy=0;
	}
	BANKACCOUNT(String name,int accno,String type,int balance, int roy)
	{
		this.name=name;
		this.accno=accno;
		this.type=type;
		this.balance=balance;
		this.roy=roy;
	}
	public void deposit(int a)
	{
		
		this.balance+=a;
	}
	public void check(int w)
	{
		if(balance>1000)
		{
			System.out.println("Withdrawl successful");
			this.balance-=w;
		}
		else
			System.out.println("withdrawl unsucessful.");
	}

	public void display()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Acc number: "+this.accno);
		System.out.println("Type: "+this.type);
		System.out.println("Balance: "+this.balance);

	}
	static void displayroy()
	{
		System.out.println("Rate of interest is " +roy);

	}
}
class banktest
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		BANKACCOUNT b1=new BANKACCOUNT();
		b1.display();
		System.out.println("enter the name,acc no,type,balance and rate of interest");
		String name=new String();
		name=s.next();
		int accno=s.nextInt();
		String type=new String();
		type=s.next();
		int balance=s.nextInt();
		int roy=s.nextInt();
		BANKACCOUNT b2=new BANKACCOUNT(name,accno,type,balance,roy);
		b2.display();

		System.out.println("1.deposit 2.Withdraw");
		System.out.println("Enter choice.");
		int choice=s.nextInt();
		if(choice==1)
		{
		System.out.println("enter the amount to be deposited");
		int a=s.nextInt();
		b1.deposit(a);
		}	
		if(choice==2)
		{
		System.out.println("Enter amount to be withdrawn");
		int w=s.nextInt();
		b2.check(w);
	    }
		BANKACCOUNT.displayroy();
		//b1.displayroy();
		
	}
}