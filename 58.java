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
		int m=input.nextInt();
		int i,count=0;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			 a[i]=input.nextInt();
	
		}
		for(i=0;i<n;i++)
		{
		if(a[i]==m)
		{
	               count++;
		}
		}
		if(count>0)
		{
		System.out.println("yes");	
		}
		else
		{
		 System.out.println("no");	
		}
	}
}
