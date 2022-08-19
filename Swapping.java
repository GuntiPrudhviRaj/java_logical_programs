import java.util.Scanner;
class Swapping
  {
    public static void main(String args[])
    {
      int a;
      int b;
      int c;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of a and b");
      a=sc.nextInt();
      b=sc.nextInt();
      System.out.println("berofe swapping");
      System.out.println("First number"+a);
      System.out.println("Second number"+b);
      c=a;
      a=b;
      b=c;
      System.out.println("After swap");
      System.out.println("First number"+a);
      System.out.println("Second number"+b);
      
      
    }
  }