class Array2_3dimensional
  {
    public static void main(String args[])
    {
      int i,j;
      int a[][]={{10,20,30},{40,50,60},{70,80,90}};

      System.out.println("the element in an array is:\n");
      for(i=0;i<3;i++)
        {
          for(j=0;j<3;j++)
            {
              System.out.print("  "+a[i][j]);
            }
          System.out.println();
        }
    }
  }