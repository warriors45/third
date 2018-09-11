
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prime
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	int flag=0;
	int i;
	for(i=2;i<=n/2;i++)
	{
		if(n%i==0)
	{
		flag=1;
		break;
	}
	}
	if(flag==0)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
	}
}
