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
		int a[]=new int[n];
		int i,j,temp;
		for(i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i;j<n;j++)
			{
			if(a[i]>a[j])
			{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
			}
		}
		for(i=0;i<n;i++)
		{
			if(i<n-1)
			{
			System.out.println(a[i]+" ");
			}
			if(i==n-1)
				System.out.println(a[i]);
}
	}
}
