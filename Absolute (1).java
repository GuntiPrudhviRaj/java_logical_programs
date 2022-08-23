import java.util.Scanner;
class Absolute
  {
    public static void main(String args[])
    {
      int a,b;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a value:");
      a=sc.nextInt();
      b=(a*(-1));
      System.out.println("print a is absolute value:"+a);
      System.out.println("print absolute integer value is:"+b);
      
    }
  }