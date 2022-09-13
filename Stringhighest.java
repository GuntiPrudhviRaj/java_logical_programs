//write a java program to find highest frquency of a character
import java.util.Scanner;
class Stringhighest
  {
    public static void main(String args[])
    {
      String str;
      int max=0,charindex=0;
      
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
           if(max<count)
           {
             max=count;
             charindex=i;
           }
        }
         System.out.println("highest frequency character is: "+str.charAt(charindex) + " and  which occurs:"+max+" times");
    }
  }