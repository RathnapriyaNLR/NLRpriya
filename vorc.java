import java.util.*;
class vorc
{
public static void main(String args[])
Scanner sc=new Scanner(System.in);
char vow=new char[5];
vow={'a','e','i','o','u'};
char ch=sc.next();
for(int i=0;i<5;i++)
{
if(vow[i]==ch)
System.out.print("vowel");
else
System.out.print("Consonant");
}
}
