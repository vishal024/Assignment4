import java.util.Scanner;
class Search
{
  public static void main(String[] args)
{
   int num,m,u,l;
   int arr[]={1,4,6,7,8,9,10};
   l=0;
   u=arr.length-1;
  Scanner s=new Scanner(System.in);
  System.out.println("enter the number which you want to search");
  num=s.nextInt();
  while(l<=u)
{
   m=(l+u)/2;
   if(arr[m]==num)
    {
      System.out.println("number is in array and found at position"+" "+m);
      break;
    }
   else if(arr[m]>num)
   {
     u=m-1;
   }
   else
   {
     l=m+1;
   }
}
if(l>u)
{
  System.out.println(" item not found and not in least computation");
}
}
}
     