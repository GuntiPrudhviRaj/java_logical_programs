import java.util.Scanner;
class Whilereverse
  {
    public static void main(String args[])
    {
      int n,r=0,digit=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter n value:");
      n=sc.nextInt();

      while(n>0)
        {
          digit=n%10;
          r=r*10+digit;
          n=n/10;
        }
        System.out.println("it is a reverse number:"+r);
      
    }
  }