import java.util.Scanner;
class Sumnatural
  {
    public static void main (String args[])
    {
      int i,n,sum=0;

      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value:");
      n=sc.nextInt();

        for(i=1;i<=n;i++)
        {
          sum=sum+i;
        }
      System.out.println("The sum of n natural numbers is:"+sum);
    }
  }
  