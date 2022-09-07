import java.util.Scanner;
class Array5
  {
    public static void main(String args[])
    {
      int i ,n,max,min;
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
      // max-min
      max=min=a[0];
      for(i=0;i<n;i++)
        {
          if(max<a[i])
            max=a[i];
          if(min>a[i])
            min=a[i]; 
        }
      System.out.println("the maximum value of array;"+max);
      System.out.println("the minimum value of array:"+min);
    }
  }