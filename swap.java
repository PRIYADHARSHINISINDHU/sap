import java.io.*;
import java.util.*;
class swap
{
public static void main(String[] args)
{
int a,b,temp;
Scanner s=new Scanner(System.in);
System.out.print("Enter the element of a:");
a=s.nextInt();
System.out.print("Enter the element of b:");
b=s.nextInt();
temp=a;
a=b;
b=temp;
System.out.println("The element of a after swapping:"+a);
System.out.println("The element of b after swapping:"+b);
}
}

