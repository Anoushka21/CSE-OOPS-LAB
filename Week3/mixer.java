import java.io.*;
import java.util.Scanner;
class MIXER {
	int arr[], n;
	 Scanner s = new Scanner (System.in);
	
	 MIXER (int n) 
	 {
		this.n = n;
		this.arr = new int[n];
	}
	
	 public void accept() 
	{
		System.out.print("Enter the length of the array: ");
		this.n = s.nextInt();
		this.arr = new int[n];
		System.out.println("enter the elements in ascending order without repitition");
		for (int i = 0; i < n; ++i) 
		{
			this.arr[i] = s.nextInt();
			
		}
	}
	
	public MIXER mix(MIXER A) 
	{
		MIXER newMixer = new MIXER (A.n + this.n);
		int i,temp,j;
		for (i = 0; i < this.n; ++i)
			newMixer.arr[i] = this.arr[i];
		for (i = 0; i < A.n; ++i)
			newMixer.arr[this.n+i] = A.arr[i];
		for(i=0;i<A.n+this.n-1;i++)
		{
			for (j=0;j<A.n+this.n-i-1;j++)
				{
					if(newMixer.arr[j]>newMixer.arr[j+1])
						{
							temp=newMixer.arr[j];
							newMixer.arr[j]=newMixer.arr[j+1];
							newMixer.arr[j+1]=temp;
						}
					}
		}
		return newMixer;
	}
	
	// Display the array
	public void display() {
		System.out.println();
		for (int i = 0; i < this.n; ++i)
			System.out.print(this.arr[i] + " ");
		System.out.println();
	}
}

public class mixer {
	public static void main(String [] args) {
		MIXER A = new MIXER(0);
		MIXER B = new MIXER(0);
		
		System.out.println("Array 1:");
		A.accept();
		
		System.out.println("Array 2:");
		B.accept();
		
		MIXER C = A.mix(B);
		System.out.println("Array 1+2: ");
		C.display();
	}
}