import java.util.Scanner;
class Continuesumodd
  {
    public static void main(String args[])
    {
      int i,n,sum=0;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number:");
        n=sc.nextInt();
      for (i=1;i<=n;i++)
        {
          if(i%2==0)
          {
            continue;
          }
          sum=sum+i;
        }
        System.out.println(+sum);
        }
    }
    
    
  
