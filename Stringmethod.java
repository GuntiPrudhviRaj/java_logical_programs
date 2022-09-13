class Stringmethod
  {
    public static void main(String args[])
    {
      String st1 = "WELCOME";
      String st2 = "Welcome";

      System.out.println("The 3rd Character in string:"+st1.charAt(3));

      System.out.println("The 'C' Character Position in string:"+st1.indexOf('C'));

      System.out.println("The 'E' Character position in String:"+st1.indexOf('E'));

      System.out.println("The 'E' Character position in String:"+st1.lastIndexOf('E'));

      System.out.println("The 'Z' Character position in String:"+st1.indexOf('Z'));

      System.out.println("The SubString Character  in the String:"+st1.substring(3));

      System.out.println("The SubString Character  in the String:"+st1.substring(6));

      System.out.println("The length of the given String:"+st1.length());

      System.out.println("The String1 in Lowercase:"+st1.toLowerCase());

      System.out.println("The String2 in Uppercase:"+st2.toUpperCase());

      System.out.println("The String joining:"+st2.concat(st1));

      if(st1.equalsIgnoreCase(st2))
      {
        System.out.println("Both Strings are Equal");
      }
       else
        {
            System.out.println("Both Strings are Not Equal");
        }
    }
  }