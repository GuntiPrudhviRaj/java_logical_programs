import java.util.Scanner;
class Array6linesearch
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
        int i,n,search;
      System.out.println("enter array size:");
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
          System.out.println("the a["+i+"] value is:"+a[i]); 
        }
      System.out.println("enter the element to search:");
      search=sc.nextInt();
      for(i=0;i<n;i++)
        {
          if(search==a[i])
          {
            System.out.println("Element is found:");
            break;
          }
        }
        if(i==n)
          System.out.println("Element is not found:");   
    }
  }