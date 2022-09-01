import java.util.Scanner;
class Fabinacco2
  {
  public static void main(String args[])
    {
     int n,n1=1,n2=0,n3=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter n value:");
     n=sc.nextInt();

      while(n>0)
        {
          System.out.println("\t"+n3);
          n3=n1+n2;
          n1=n2;
          n2=n3;
          n--;
        }
      
    }
  }