import java.io.*;
import java.util.*;
class intrev
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,rem=0;
System.out.println("Enter a number");
n=sc.nextInt();
while(n>0){
rem=rem*10;
rem=rem+(n%10);
n=n/10;
}
System.out.println("The reversed integer is "+ rem);
}}
