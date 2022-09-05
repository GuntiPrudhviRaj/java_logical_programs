import java.util.Scanner;
class Continue
  {
    public static void main(String args[])
    {
      int i,n;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number:");
        n=sc.nextInt();
      for (i=1;i<=n;i++)
        {
          if(i%2!=0)
            continue;
          System.out.println(i+" ");
        }
    }
  }