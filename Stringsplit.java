class Stringsplit
  {
    public static void main(String args[])
    {
      String st1= "WElCOME to bitlabs";
      String txt[]=st1.split(" ");

      for(int i=0;i<txt.length;i++)
        {
          System.out.println(txt[i]);
        }
      for(String w:txt)
        {
          System.out.println(w);
        }
    }
  }