import java.util.Scanner;
class armstrong
  {
    int sum=0,digit=0;

    int arm(int n)
    {
      while(n>0)
        {
          digit=n%10;
          sum=sum+digit*digit*digit;
          n=n/10;
        }
          
            return sum;
        }
  }

   class OOPS_Armstrong
      {
        public static void main(String args[])
        {
             int m,z;
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the number:");
             m=sc.nextInt();
             armstrong a1=new armstrong();
             z=a1.arm(m);
             if(z==m)
             {
             System.out.println("It is Armstrong number:");
             } 
            else
            {
            System.out.println("It is not Armstrong number:");
           }
         }
    }

  
        
    
  