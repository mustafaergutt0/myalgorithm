package Homework1;

public class TimeComp {

    // in this code we  have two running time comp algortim
    // we are founding smallest value
    /* one of =100*n*n other is two power n like 2'n

     What is the smallest value of 𝑛 such that an algorithm whose running time is 100𝑛" runs
faster than an algorithm whose running time is 2$ on the same machine? Write a simple Java
code that tries different values for 𝑛 and solves this problem.

// we can find which algortihm to be used efficenly

// 
     */
    public static void main(String[] args) {
        int ten=1;
        int twopowern=1;

        for(int i=1;i<=100;i++){
            ten=100*i*i;
            twopowern= (int) Math.pow(2,i);
            if(i==14){ // ı added  to control
                System.out.println(ten);
                System.out.println(twopowern);
                System.out.println(i);
                System.out.println(" ");
            }
            if(twopowern>ten){
                System.out.println(i+" "+ten+" "+twopowern);
                break;
            }
        }


    }
}
