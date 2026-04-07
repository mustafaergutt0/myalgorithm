package LeetCodeAndAlgorthm;

public class ShuffleArray {
    static void main() {

    }


    static public int [] shuflleArray(int nums[] ,int n ){
        int data[]=new int [nums.length];
         // burdan başladık
        int c=0;

        for(int i=0;i<nums.length/2;i++){
            data[c]=nums[i];  // bir taneesi c 2 2 artıyor   normal nums i dizisensen sıfırldan başlayarl
            data[c+1]=nums[n];
            n=n+1; // b ikinci bölgeisnden noraml şekilde artsın
            c=c+2;
        }
        return data;
    }
}
