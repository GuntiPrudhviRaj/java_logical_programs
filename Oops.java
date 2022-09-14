import java.util.Scanner;
class Factorial
  {
    int n,i,fact=1;
    Scanner sc = new Scanner(System.in);
    
    void fact()
    {
      System.out.println("enter n value:");
      n=sc.nextInt();
      for(i=1;i<=n;i++)
      fact=fact*i;
      System.out.println("the factorial of number:"+fact);
    }
  }
  class Oops
    {
      public static void main(String args[])
      {
        Factorial a1=new Factorial();
        a1.fact();
        
        
      }
    }