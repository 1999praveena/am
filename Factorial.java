import java.io.*;
import java.util.*;
class Factorial
{

	public static void main(String[] args) 
  {

int a=1,i,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
b=sc.nextInt();
for(i=1;i<=b;i++)
{
a=a*i;
System.out.println(a);
}

	}
}
