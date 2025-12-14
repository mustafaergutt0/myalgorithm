package Homework1;

import java.util.Scanner;

public class FindNCertainOnTime {

    // you find microsecond for minute hours day and motnh

    // if our algortim time on given groth function break up
    // give me for n value
    /// in that area we are defining 6 methots which they calculate time aspect of growth functions
    //


    public static void main(String[] args) {
       givenNvalueforN();
    }


    public  static void GiveNvalueNLOGN() {

          // I defined  time to control our olagorthm if bigger than time it breaks

        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter the time in microseconds: ");
        double time = sc.nextDouble();
        double n = 1;

        while (n * (Math.log(n) / Math.log(2)) <= time) {
            n++;
        }
        System.out.println("The largest n for n log n is: " + (n - 1));

    }

    public static  void givenNvalueforN(){
        Scanner scan=new Scanner(System.in);
        double time= scan.nextDouble();
        int n =1;
        while (n<time){
            n++;

        }
        System.out.println("the largest value  n for n is "+ (n-1));
    }


    public static void GiveNvaluelogn() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time in microseconds: ");
        double time = sc.nextDouble();
        double n = 1;
        while ((Math.log(n) / Math.log(2)) <= time) {
            n++;

        }
        System.out.println("The largest n for n log n is: " + (n - 1));


    }

    public  static void GiveNvalueforNN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter for time ");
        double time = sc.nextDouble();
        double n = 1;
        while (n * n <= time) {
            n=n+1;

        }
        System.out.println("The largest n for n log n is: " + (n - 1));
    }

    public static void GiveNvalueforTwoPowerN() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the time in microseconds: ");
        double time= scan.nextDouble();
         int n =1;
         while(Math.pow(2,n)<time){
             n=n+1;
         }
        System.out.println("the largest n for 2*n is " + (n-1));

    }
    public static void GivenNValueFORNFACT(){

        // same methot used  on different growth functions
        Scanner scan=new Scanner(System.in);
        System.out.println("pelase enter microsdenc");
        double time= scan.nextDouble();

        int n =1;
        int fack=1;
        while(fack<time){
            fack=n*fack;
            n++;
        }
        System.out.println("this algortihm " + (n-1));

    }


}
