//witre a program to find Frequancy of each  character in string
import java.util.Scanner;
class Stringfrequancy
  {
    public static void main(String args[])
    {
      String str;
      Scanner sc = new Scanner(System.in);
      System.out.print("\nEnter the string:");
      str=sc.nextLine();
      int n=str.length();
      boolean visited[]=new boolean[n];

      for(int m=0;m<n;m++)
        visited[m]=false;
       System.out.println("element count");
      for(int i=0;i<n;i++)
        {
          if(visited[i]==true)
            continue;
          
          int count=1;
          for(int j=1+1;j<n;j++)
            {
              if(str.charAt(i) == str.charAt(j))
              {
                visited[j]=true;
                count++;
              }
            }
           System.out.println(str.charAt(i) + "\t" +count);
        }
    }
  }