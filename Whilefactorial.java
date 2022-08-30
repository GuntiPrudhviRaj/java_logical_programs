import java.util.Scanner;
class Whilefactorial
  {
    public static void main(String args[])
    {
      int n,fact=1;

      Scanner sc = new Scanner(System.in);
      System.out.println("enter n value:");
      n=sc.nextInt();
    
      while(n>=1)
        {
          fact=fact*n;
           n--;
        }
        System.out.println("the factorial of given number is:"+fact);
    }
  }
