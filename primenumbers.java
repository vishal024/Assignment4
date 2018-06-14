import java.util.Scanner;
class Prime
{
public static void main(String[] args)
{
 int i,j,n;
 Scanner s=new Scanner(System.in);
 System.out.println("enter the number");
 n=s.nextInt();
 for(j=1;j<=n;j++)
{
   for(i=2;i<=j;i++)
{
    if(j%i==0)
    { 
      break;
    }
}
   if(i==j)
{
  System.out.println("prime numbers:"+j);
}
}
}}