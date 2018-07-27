/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class vowels
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner(System.in);
		char c=input.next().charAt(0);
		if(c=='a' || c== 'e' || c=='i' || c=='o' ||  c=='u')
		{
			System.out.println("Vowel");
		}
		else if(c=='b' || c=='c' || c=='d' || c=='f' || c=='g' || c=='h' || c=='j'|| c=='k' || c=='l' || c=='m'|| c=='n'|| c=='p'|| c=='q'|| c=='r'|| c=='s'|| c=='t'|| c=='v'|| c=='w'|| c=='x'|| c=='y'|| c=='z')
	{
		System.out.println("Consonant");
	}
	else
	{
		System.out.println("invalid");
	}
}
}
