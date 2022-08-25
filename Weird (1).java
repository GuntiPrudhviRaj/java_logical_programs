import java.util.Scanner;
class Weird
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number:");
      n=sc.nextInt();
      if(n%2!=0)
      { 
        System.out.println("weird");
      }  
      else if(n>=2&&n<=5)
      {  
        System.out.println("not weird");
      }  
      else if(n>=6&&n<=20)
      {  
        System.out.println("weird");
      }  
      else
      {
        System.out.println("not weird");
      }  
      
    }
  }