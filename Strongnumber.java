import java.util.Scanner;
class Strongnumber
  {
    public static void main(String args[])
    {
      int number,num,sum=0,digit=0,fact;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter n value:");
      number=sc.nextInt();
      num=number;
      while(number>0)
        {
          digit=number%10;
          int mul=1;
          for(int i=1;i<=digit;i++)
            {
              mul=mul*i;
            }
           sum=sum+mul;
           number=number/10;
          
        }
      if(sum==num)
      {
        System.out.println("number is strong:");
      }
      else
      {
        System.out.println("number is not strong:");
      } 
      
      
      
    }
  }
