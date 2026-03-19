package LeetCodeAndAlgorthm;

public class CountPrimes {
    static void main() {

    }


    static public int CountPrimes(int n){

        boolean[] aLLPrimesInts = new boolean[n];


        for (int i =0;i<n;i++){
            aLLPrimesInts[i] = true;
        }


        for(int i=2;i<i*i;i++){
            if(aLLPrimesInts[i]==true){
                for (int j = i * i; j < n; j += i) {
                    aLLPrimesInts[j] = false;
                }

            }

        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (aLLPrimesInts[i]) count++;
        }

        return count;
    }
}
