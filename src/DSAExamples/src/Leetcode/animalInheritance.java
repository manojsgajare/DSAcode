package DSAExamples.src.Leetcode;

public class animalInheritance {
    protected String name;

    protected void display()
    {
        System.out.println("I am an animal");
    }
}

class dog extends animalInheritance{
    public void getInfo(){
        System.out.println("my name is: "+ name);
    }
}

class Main{
    public static void main(String[] args) {

        //Create object of the subclass
        dog labrador = new dog();

        //Access protected field and method
        //using the object of the subclass
        labrador.name = "Rock";
        labrador.display();

        labrador.getInfo();
    }
}
