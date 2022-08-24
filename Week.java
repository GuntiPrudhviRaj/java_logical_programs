import java.util.Scanner;
class Week
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();
      if(n==1)
      {
        System.out.println("print monday:");
      }
         else if(n==2)
         { 
           System.out.println("print Tuesday:");
         }
         else if(n==3)
         {
           System.out.println("print wednesday:");
         } 
         else if(n==4)
         {
          System.out.println("print Thursday:"); 
         }
         else if(n==5)
         {
          System.out.println("print Friday:"); 
         }
         else if(n==6)
         {
          System.out.println("print Saturday:"); 
         }
         else if(n==7)
         {
          System.out.println("print Sunday:"); 
         }
         else
         {
           System.out.println("No day");
         }  
      }
    }
  