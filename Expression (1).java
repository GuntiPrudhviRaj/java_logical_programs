import java.util.Scanner;
class Expression
  {
    public static void main(String args[])
    {
      int a,b,c;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter  a value:");
      a=sc.nextInt();
      System.out.println("enter b value:");
      b=sc.nextInt();
      System.out.println("enter c value:");
      c=sc.nextInt();
      if(a==b&&b==c&&c==a)
      {
        System.out.println("All variables are equal:");
      }
      else
      {
        System.out.println("All variables are not equal:");
      }  
      } 
    }
  