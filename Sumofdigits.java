import java.util.Scanner;
class Sumofdigits
  {
    public static void main(String args[])
    {
      int num,sum=0,digit=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number:");
      num=sc.nextInt();
      while(num>0)
        {
          digit=num%10;
          sum=sum+digit;
          num=num/10;
        }
         System.out.println("sum of digits of positive integer:"+sum);
    }
  }