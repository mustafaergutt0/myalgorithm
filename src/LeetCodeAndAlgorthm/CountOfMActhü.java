package LeetCodeAndAlgorthm;

public class CountOfMActhü {

    static void main() {
        System.out.println(countmatch(6));

    }

    public static int countmatch(int n){
        int numberofMatch=0;
        while(n!=1){
            if(n%2==0){
                n=n/2;
                numberofMatch+=n;
            }else{
                int x=(n-1)/2; //mathces
                n=(n-1)/2 +1;
                numberofMatch+=x;
            }

        }
        return numberofMatch;
    }

    //aslında sunla aynı aq
    //
    public static int countmatch2(int n){
        return n-1;

    }
}
