import java.util.Scanner;                               class Employeeruntime
    {
      public static void main(String args[])
      {
        int eno;
        String ename;
        float esa;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Employee Number is");
        eno=sc.nextInt();
        System.out.println("Enter the Emoloyee Name is");
        ename=sc.next();
        System.out.println("Enter the Employee Salary is");
        esa=sc.nextFloat();
        System.out.println("The Employee Number is"+eno);
        System.out.println("The Employee Name is"+ename);
        System.out.println("The Employee Salary is"+esa);
      }
    }