import java.util.Scanner;
class Whileprime
  {
    public static void main(String args[])
    {
      int i=1,n,c=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter n value:");
      n=sc.nextInt();
      while(i<=n)
      {
        if(n%i==0)
          c++;
          i++;
      }
      if(c==2)
        System.out.println("its prime number:");
      else
        System.out.println("its  not prime number:");
    }
  }