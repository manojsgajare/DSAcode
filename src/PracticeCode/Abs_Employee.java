package PracticeCode;

import java.util.*;
abstract class Abs_Employee
{
    abstract void user();
}
class manager extends Abs_Employee
{
    Scanner abs = new Scanner(System.in);
    void user()
    {
        System.out.println("Enter name: ");
        String name= abs.next();
        System.out.println(name);
    }
}
