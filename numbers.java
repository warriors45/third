/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class numbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int m=input.nextInt();
    for (int i=n+1;i<m;i++)
    {
    	if(i%2==1)
    	{
    		System.out.println(i+"\t");
    	}
    }
	}
}
