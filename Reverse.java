import java.util.Scanner;
class Reverse
{
 public static void main(String[] args)
{
int rev=0,rem;
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int num=s.nextInt();
while(num!=0)
{
rem=num%10;
rev=rev*10+rem;
num=num/10;
}
System.out.println("Reverse number is:"+rev);
s.close();
}
}