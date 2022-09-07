import java.util.Scanner;
class Arraybubblesorting
  {
    public static void main(String args[])
    {
      int i,j,n,t;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter array size:");
      n=sc.nextInt();
      System.out.println("enter element to array:");
      int a[]=new int[n];
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("Before sorting element is:");
      for(i=0;i<n;i++)
        {
          System.out.println("The a["+i+"] value is:"+a[i]);
        }
      for(i=0;i<n-1;i++)
        {
          for(j=0;j<n-1-i;j++)
            {
              if(a[j]>a[j+1])
              {
                t=a[j];
                a[j]=a[j+1];
                  a[j+1]=t;
              }
            }
        }
      System.out.println("After sorting element is:");
      for(i=0;i<n;i++)
        {
          System.out.println("The a["+i+"] value is:"+a[i]);
        }
        
        
      
    }
  }