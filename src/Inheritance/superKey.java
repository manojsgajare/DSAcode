package Inheritance;
// Find the volume of cube
// Volume of cube = (Side)3

// Find volume of cuboid
// Volume of the cuboid = (length × breadth × height)

import java.util.Scanner;

class cube{
    Scanner sc = new Scanner(System.in);
    int a ,vol1;
    void volume(){
        System.out.println("Enter edges: ");
        a = sc.nextInt();
        vol1 = a*a*a;
        System.out.println("Volume of cube is " + vol1);
    }
}
class cuboid extends cube{
    void volume(){
        super.volume();
        int length, width, height, vol2;
        System.out.println("Enter length width and height: ");
        length = sc.nextInt();
        width = sc.nextInt();
        height = sc.nextInt();
        vol2 = length * width * height;
        System.out.println("Volume of cuboid is: "+ vol2);
    }
}


public class superKey {
    public static void main(String[] args) {

        cuboid c = new cuboid();
        c.volume();
      //  c.volume();
    }
}
