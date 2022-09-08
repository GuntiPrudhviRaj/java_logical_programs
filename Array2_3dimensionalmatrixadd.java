import java.util.Scanner;
class Array2_3dimensionalmatrixadd
  {
    public static void main(String args[])
    {
      int r1,c1,r2,c2,i,j;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter order of first matrix:");
      r1=sc.nextInt();
      c1=sc.nextInt();
      System.out.println("enter order of second matrix:");
      r2=sc.nextInt();
      c2=sc.nextInt();

      if(r1==r2&&c1==c2)
     {
      int a[][]=new int[r1][c1];
      int b[][]=new int[r2][c2];
      int c[][]=new int[r1][c1];
      System.out.println("enter elements to first matrix:");

      for(i=0;i<r1;i++)
        {
          for(j=0;j<c1;j++)
            {
              a[i][j]=sc.nextInt();
            }  
        }
      System.out.println("enter elements to second matrix:");

      for(i=0;i<r2;i++)
        {
          for(j=0;j<c2;j++)
            {
              b[i][j]=sc.nextInt();
            }  
        }
       for(i=0;i<r2;i++)
        {
          for(j=0;j<c2;j++)
            {
              c[i][j]=a[i][j]+b[i][j];
            }  
        }
        System.out.println("the elements in an first matrix is:\n");
          for(i=0;i<r1;i++)
            {
              for(j=0;j<c1;j++)
                {
                  System.out.print("  "+a[i][j]);
                }
              System.out.println();
            }
        System.out.println("the elements in an second matrix is:\n");
          for(i=0;i<r2;i++)
            {
              for(j=0;j<c2;j++)
                {
                  System.out.print("  "+b[i][j]);
                }
              System.out.println();
            }
         System.out.println("the elements in an array  of addition   matrix is:");
           for(i=0;i<r1;i++)
            {
              for(j=0;j<c1;j++)
                {
                  System.out.print("  "+c[i][j]);
                }
              System.out.println();
            }
         }  

      else
                {
                  System.out.print("addition of a matrix not possible:");
                }

      
    }
  }