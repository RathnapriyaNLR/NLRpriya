import java.util.*;
class fact
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sum=0;
int a=sc.nextInt();
while(a>0)
{
sum=sum+(a*(a-1));
a=a-2;
}
System.out.print(sum);
}
}
