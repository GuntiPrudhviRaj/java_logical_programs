import java.util.Scanner;
class Array3
  {
    public static void main(String args[])
    {
      int i ,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size:");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter element to array:");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("the element in an array is:");
      for(i=0;i<n;i++)
        {
          System.out.print("\t"+a[i]);
        }
    }
  }