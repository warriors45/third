/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Array
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner(System.in);
		int N=input.nextInt();
		int K=input.nextInt();
		int sum=0;
		for(int i=1;i<=K;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
