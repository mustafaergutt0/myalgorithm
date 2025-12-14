package LeetCodeAndAlgorthm;

public class JumtToFinalGame {

    // ı found solution one day because of lack algorthim thinking
    // this algortihm is working as n time complextisty
    // this is simple game start firs index and on index add you index go jump that index

    //  just one case you have  to evaluate this case array just have one element which is zero
    // other step there is index on every step you go , add arr[index] to data

    // it is created by Mustafa Ergut this is on the way to be game

    // it will increase of capacity

    // you can add two person and they reach t



    public static void main(String[] args) {

        int data[] = {2,0};
        System.out.println(JumpToFinal(data));
    }

    public static boolean JumpToFinal(int[] arr) {
        int indexToplam = 0;
        int counter = 0;

        if (arr.length == 1) {
            return arr[0] == 0 || arr[0] == 1;
        }

        while (indexToplam < arr.length && counter < arr.length) {
            if (indexToplam == arr.length - 1) {
                return true;
            }

            if (indexToplam + arr[indexToplam] >= arr.length) {
                return false;
            }

            indexToplam = indexToplam + arr[indexToplam];
            counter++;
        }
        return false;
    }



}