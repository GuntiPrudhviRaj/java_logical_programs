class Stringreverse
  {
    public static void main(String args[])
    {
      String st1= "WELCOME";


      System.out.println("The Reverse of the Given String is:");

      for(int i=st1.length();i>0;i--)
        {
          System.out.print(st1.charAt(i-1));
        }
      
        
    }
  }