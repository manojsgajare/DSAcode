package PracticeCode;
import java.util.Scanner;

    class SuperKeyWord {
        Scanner sc = new Scanner(System.in);
        int a, vol1;

        void volume() {
            System.out.println("Enter edges: ");
            a = sc.nextInt();
            vol1 = a * a * a;
            System.out.println("Volume of cube is: " + vol1);
        }
    }

    class cuboid extends SuperKeyWord {
        void volume() {
            super.volume();

            int len, wid, ht;
            System.out.println("Enter length, width, height");

            len = sc.nextInt();
            wid = sc.nextInt();
            ht = sc.nextInt();

            int vol = len * wid * ht;
            System.out.println("The volume of cuboid is: " + vol);
        }

        public static void main(String[] args) {
            cuboid ad = new cuboid();
            ad.volume();
        }
    }
//Method Overriding

