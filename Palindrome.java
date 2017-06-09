import java.io.*;
import java.util.*;
class Palindrome
{
publicstatic void main(String args[])
{
int n,a,rem=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
a=n;
while(n>o)
{
rem=rem*10;
rem=rem+(n%10);
n=n/10;
}
if(a==rem)
{
System.out.println(rem +" is a palindrome");
}
{
else
{
System.out.println(rem+" is not a palindrome");
}
}
}
