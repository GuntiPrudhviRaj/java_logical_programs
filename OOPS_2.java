import java.util.Scanner;
class Factorial
  {
    int i,f=1;

    int fact(int n)
    {
      for(i=1;i<=n;i++)
      f=f*i;
        return f;
    
    }
  }
   class OOPS_2
     {
       public static void main(String args[])
       {
         int n,m;
         Scanner sc=new Scanner(System.in);
         System.out.println("enter n value:");
         n=sc.nextInt();
         Factorial a1=new Factorial();
         m=a1.fact(n);
         System.out.println("the factorial of a number:"+m);
         
       }
     }