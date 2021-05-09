import java.io.*;
import java.util.Scanner;

class addcomma
{
	 static String add(String string)
	{
		int j = 0;
		String newString = "";
		for (int i = string.length() - 1; i >= 0; --i) {
			char z = string.charAt(i);
			if ( (++j) % 3 == 0 && i > 0)
				newString = "," + z + newString;
			else
				newString = z + newString;
		}
		return newString;
	}
	public static void main(String[] args)
	{
		String str=new String();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		str=s.nextLine();
		System.out.println("Original number: " + str + "\tModified number: " + add(str));
	}
}