/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Natural
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner i=new Scanner(System.in);
		int a=i.nextInt();
		int sum=0;
		for(int j=1;j<=a;j++)
		{
		sum=sum+j;
		}
		System.out.println(sum);
	}
}
