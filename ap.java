/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ap
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a=input.nextInt();
		int d=input.nextInt();
		int sum;
		sum=(n*((2*a)+(n-1)*d))/2;
		System.out.println(sum);
		}
	}
