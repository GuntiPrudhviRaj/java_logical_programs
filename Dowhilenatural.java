import java.util.Scanner;
class Dowhilenatural
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter n value");
      n=sc.nextInt();

      do
        {
          System.out.println(n);
          n++;
        }
        while(n<=10);
    }
  }