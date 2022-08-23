import java.util.Scanner;
class Conditional
  {
    public static void main(String args[])
    {
      int a,b;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a value:");
      a=sc.nextInt();
      System.out.println("enter b value:");
      b=sc.nextInt();
      if (a>b)
      {
        System.out.println("print A is big:"+a);
      }  
      else
      {
        System.out.println("print b is big:"+b);
      }
    }
  }