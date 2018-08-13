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
	          int flag=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isLetter(c))
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("No");
		}
		else
		{
			System.out.println("yes");
		}
	}
}
