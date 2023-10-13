package anudeep_6058;
import java.util.*;
public class StringShift {

	public static void main(String[] args) 
	{
		System.out.println("enter string:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder();//to store temporary output
		for(int i=0;i<s.length();i++)
		{
			int j=(int)s.charAt(i);
			if(j==65)//if character is A output should be Y
			{
				j=89;
				char c=(char)j;
				sb.append(c);
			}
			else if(j==66)//if character is B output should be Z
			{
				j=90;
				char c=(char)j;
				sb.append(c);
			}
			else if(j>=67 && j<=90)//characters from C to Z output left shifted by 2
			{
				j=j-2;
				char c=(char)j;
				sb.append(c);
				
			}
			else if(j==97)//if character is 'a' output should be x
			{
				j=120;
				char c=(char)j;
				sb.append(c);
			}
			else if(j==98)//if character is 'b' output should be y
			{
				j=121;
				char c=(char)j;
				sb.append(c);
			}
			else if(j==99)//if character is 'c' output should be z
			{
				j=122;
				char c=(char)j;
				sb.append(c);
			}
			else if(j>=100 && j<=122)//if character is d to z left shift by 3
			{
				j=j-3;
				char c=(char)j;
				sb.append(c);
			}
		}
		System.out.println(sb);
		

	}

}
