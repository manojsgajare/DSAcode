package Threading;

import java.util.Scanner;


    public class SynchronizedThreading extends Thread {
        Scanner sc = new Scanner(System.in);
        int amt = 50000;


        synchronized void deposit () throws InterruptedException {
            System.out.println("Enter the deposite amount: ");
            long d_amt = sc.nextInt();
            this.amt += d_amt;
            System.out.println("Total balance now is: " + this.amt);

            notify();
        }

        synchronized void withdraw () throws InterruptedException {
            System.out.println("Enter the withdraw amount: ");
            long w_amt = sc.nextInt();
            if ((w_amt < 2000)||(this.amt < 2000)) {
                System.out.println("Invalid request: ");
            } else if (w_amt > this.amt) {
                System.out.println("Insufficient balance: ");
            } else {
                this.amt -= w_amt;
                System.out.println("Remaining balance: " + this.amt);
            }
            notify();
        }

        public static void main (String[]args){
            SynchronizedThreading td = new SynchronizedThreading();
            new Thread();
            try {
                td.deposit();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new Thread();
            {
                try {
                    td.withdraw();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
        }
    }

/*

   code B- First withdraw and deposit

 import javax.xml.stream.events.StartDocument;
 import java.util.*;
 import java.lang.*;

 public class Threading extends Thread {
     Scanner sc = new Scanner(System.in);
     int amt = 20000;

     synchronized void withdraw() throws InterruptedException {
         System.out.println("Enter withdraw amount: ");
         int w_amt = sc.nextInt();
         if (w_amt > amt) {
             System.out.println("Insufficient balance");
             wait();
         } else
             this.amt -= w_amt;
         System.out.println("Available balance is: " + this.amt);
         notify();
     }

     synchronized void deposite() throws InterruptedException {
         System.out.println("Enter deposite amount: ");
         int d_amt = sc.nextInt();
         this.amt += d_amt;
         System.out.println("Available balance is: " + this.amt);

         notify();
     }

     public static void main(String[] args) {
         Threading td = new Threading();

         new Thread();
         {
             try {
                 td.withdraw();
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }

         new Thread() {
             public void run() {
                 try {
                     td.deposite();
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
         };
     }
 }
*/


