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
	     int sum=0;
             int r;
	     while(n>0)
	     {
	     	r=n%10;
	     	sum=sum+r;
	     	n=n/10;
	     }
	     System.out.println(sum);
	}
}
