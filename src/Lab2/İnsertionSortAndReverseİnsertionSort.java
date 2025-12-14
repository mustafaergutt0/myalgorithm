package Lab2;

public class İnsertionSortAndReverseİnsertionSort {
    public static void main(String[] args) {
        int data []={2,5,698,4,58,23,5,1,2,3};
        insertion_sort_reverse(data);
        for(int i=0; i<data.length; i++) {
            System.out.println(data[i]);
        }

        int da[]=FillBox(10000);







    }

    public  static void insertion(int [] data){
        int n = data.length;  // firstly we examined data lenght
        for(int i=2;i<n;i++){
            int temp = data[i];  // temp data is selected first i
            int j = i-1;  // i started with 2 beacuse of j
            while(j>=0 && temp<data[j]){
                data[j+1] = data[j];
                j=j-1;
            }
            data[j+1] = temp;
        }
    }
    public static void insertion_sort_reverse(int[] A) {
        int n = A.length;
        for (int i = 1; i < n; i++) {
            int key = A[i];
            int j = i - 1;

            // Move elements that are smaller than key
            while (j >= 0 && A[j] < key) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = key;
}
}

public  static int[] FillBox(int number){
        int mybox[]=new int[number];
        for(int i=0;i<number;i++){
            int num= (int) (Math.random()*100);
            mybox[i]=num;
        }
        return mybox;
}
}
