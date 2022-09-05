import java.util.Scanner;
class Continueeven
  {
    public static void main(String args[])
    {
      int a=-2,n,sum=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number:");
      n=sc.nextInt();

      for(int i=1;i<=n;i++)
        {
          a=a+2;
          if(a%3==0)
         sum+=a;
        }
           System.out.println(sum);
      
    }
  }