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
		int a=input.nextInt();
		int b=input.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
	}
}
