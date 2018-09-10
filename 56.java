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
		int i;
		int alpha=0,num=0;
		for(i=0;i<a.length;i++)
		{
			if('a'<=a[i] && a[i]<='z' || 'A'<=a[i] && a[i]<='Z')
			{
				alpha=1;
			}
			if('0'<=a[i] && a[i]<='9')
			{
				num=1;
			}
		}
			if(num==1 && alpha==1)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
	}
