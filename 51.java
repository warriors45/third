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
        int rev=0;
        int r,temp;
        while(n>0)
        {
        	r=n%10;
        	rev=(rev*10)+r;
        	n=n/10;
        }
        temp=rev;
        while(temp>0)
        {
        	r=temp%10;
        	System.out.print( r +" ");
        	temp=temp/10;
        }
	}
}
