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
		String s=input.next();
		char a[]=s.toCharArray();
		boolean b=false;
		for(char aa:a)
		{
			char ch=aa;
			if(ch=='1' || ch=='0')
			{
				b=true;
			}
			else
			{
				b=false;
				break;
			}
		}
	 if(b)
	 {
	 	System.out.println("yes");
	 }
	 else
	 {
	 	System.out.println("no");
	 }
	}
}
