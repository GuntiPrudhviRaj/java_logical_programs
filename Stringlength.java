class Stringlength
  {
    public static void main(String args[])
    {
      String st1="WELCOME";
      int c=0;

      for(char c1:st1.toCharArray())
      {
        c++;
      } 
      System.out.println("The  length of the Given String is:"+c);
    }  
  }