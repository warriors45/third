/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class fact
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int fact=1;
		int i;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact+" ");
	}
}
