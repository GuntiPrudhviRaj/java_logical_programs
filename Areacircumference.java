import java.util.Scanner;
class Areacircumference
  {
    public static void main(String args[])
    {
      int l,b;
      float area,perimeter;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter value the lenghth:");
      l=sc.nextInt();
      System.out.println("Enter value the breadth:");
      b=sc.nextInt();
      System.out.println("The area of circle is:");
      area=l*b;
      System.out.println("The perimeter of a circle is:");
      perimeter=2*(l+b);
      System.out.println(area);
      System.out.println(perimeter);
    }
  }