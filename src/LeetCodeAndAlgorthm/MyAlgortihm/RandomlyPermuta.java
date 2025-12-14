package LeetCodeAndAlgorthm.MyAlgortihm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;



//*/   bu kodda yapacagız düzeltem bu veirlen bir arrayaıo randomly bir şekilde karşıyıryo peki biz bunu listersek ve
// listede tutar kaç kere çıktığpına bakabrizi döngü  data lengt faktörileyer kadar gitmeli



public class RandomlyPermuta {
    public static void main(String[] args) {
        int mydata[]={1,2,3,5,6,4,5};
        randomlyPermuta(mydata);

    }

    public static void randomlyPermuta(int data[]) {
        // burda first index how much element will be instered , will be facktiol of

        int n = data.length;
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int randomIndex = i + rand.nextInt(n - i);
            int temp = data[i];
            data[i] = data[randomIndex];
            data[randomIndex] = temp;
        }

        for(int j = 0; j < n; j++) {
            System.out.println(data[j]);
        }


    }

}
