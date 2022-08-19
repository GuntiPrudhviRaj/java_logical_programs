import java.util.Scanner;
class Swap
  {
    public static void main(String args[])
    {
      int a;
      int b;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of a and b");
      a=sc.nextInt();
      b=sc.nextInt();
      System.out.println("Before swap");
      System.out.println("First number"+a);
      System.out.println("Second number"+b);
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("After swap");
      System.out.println("First number"+a);
      System.out.println("Second number"+b);
   }
  }