/* package whatever; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prime
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	int m=input.nextInt();
	int flag=0;
	int i,j;
	for(i=n;i<m;i++)
	{
	for(j=2;j<i;j++)
	{
		if(i%j==0)
	{
		flag=0;
		break;
	}
	else
	{
	flag=1;
	}
	}
	
	if(flag==1)
	{
		System.out.println(i);
	}
	}
}
}
