package LeetCodeAndAlgorthm.MyAlgortihm;

import java.util.HashMap;
import java.util.Stack;

// it calculate  to given value flip coin
// it gives probabiltiy of head and
public class FlipCoin {

    public static void main(String[] args) {
        Random(20);










    }

    public static  int [][]Random(int Howmany ){
        int sayi= (int) (Math.random()*1);  // it is randomed 0,1
        int array[][]=new int[Howmany][Howmany];
        for(int i=0;i<Howmany;i++){
            for(int j=0;j<i;j++){
                array[i][j]=(int) (Math.random()*2);
            }
        }
        for(int i=0;i<Howmany;i++){
            int Head=0;
            int Tail=0;
            for(int j=0;j<i;j++){
                System.out.print(  array[i][j]);
                if(array[i][j]==1){
                    Head++;
                }else{
                    Tail++;
                }
            }
            System.out.print("");
            System.out.println("");
            System.out.println( "Number of Head " + Head  +  " " +"Number of Tail  : " + Tail);
            System.out.println(" ");
        }
           return array;
    }



}
