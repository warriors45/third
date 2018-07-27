/* package whatever; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
class Leap
{
 
    public static void main(String[] args) 
    {
 
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        if(a%4==0)
        {
        	System.out.println("yes");
        }
        else
        {
        	System.out.println("no");
        }
    }
}
