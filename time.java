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
		int min,hours;
		if(n%n==0)
		{
		hours=n/60;
		min=n%60;
		
		System.out.println(hours+" "+min);
		}
	}
}
