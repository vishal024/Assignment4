import java.util.Scanner;
class Armstrong
{
  public static void main(String[] args)
{
  int num,x,sum,r;
 Scanner s=new Scanner(System.in);
  System.out.println("enter the number");
  num=s.nextInt();
  x=num;
  sum=0;
  while(x!=0)
{ 
   r=x%10;
   sum=sum+r*r*r;
   x=x/10;
 }
if(sum==num)
{
 System.out.println("number is armstrong");
}
else
{
  System.out.println("number is not armstrong");
}
}
}

   