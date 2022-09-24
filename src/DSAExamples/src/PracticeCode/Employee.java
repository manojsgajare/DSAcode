package DSAExamples.src.PracticeCode;

import java.util.Scanner;
abstract class Employee
{
    abstract void user();
}
class developer extends Employee
{
    Scanner abs = new Scanner(System.in);
    void user()
    {
        System.out.println("Enter name: ");
        String name= abs.next();
        System.out.println(name);
    }
}
