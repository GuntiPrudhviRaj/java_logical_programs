//write a JAVA program to copy all elements from an array to another array
import java.util.Scanner;
class Arraycopy
  {
    public static void main(String args[])
    {
      int i;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the array size:");
      int n=sc.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      System.out.println("enter the elements of an array:");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();  
        }
      for(i=0;i<n;i++)
        {
          b[i]=a[i];
        } 
      System.out.println(" the elements in an array:");
      for(i=0;i<n;i++)
        {
          System.out.print(+a[i]);
        }
      System.out.println();
      System.out.println("the elements  in an copied array:");
      for(i=0;i<n;i++)
        {
          System.out.print(+b[i]);
        }
      System.out.println();
    }
    
    
  }