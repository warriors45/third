
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner(System.in);
		int a[]=new int[10];
		int i;
		for(i=0;i<10;i++)
		{
		 a[i]=input.nextInt();
		}
		int min=a[0];
		for(i=0;i<10;i++)
		{
			if(min>a[i])
			{
			min=a[i];
			}
		}
			System.out.println(min);
	}
}
