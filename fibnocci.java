/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int first=1,second=1,next,i;
		if(n==1)
		{
			System.out.println(first);
		}
		else if(n==2)
		{
			System.out.println(second);
		}
		else
		{
			System.out.print(first+" "+second);
			for(i=2;i<n;i++)
			{
			next=first+second;
			System.out.print(" "+next);
			first=second;
			second=next;
		}
		
	}
}
}
