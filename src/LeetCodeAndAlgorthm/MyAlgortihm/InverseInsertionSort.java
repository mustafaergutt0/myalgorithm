package LeetCodeAndAlgorthm.MyAlgortihm;

public class InverseInsertionSort {
    public static void main(String[] args) {
        int mydata[]={1,2,3,4,5,6};
        inverserInsertionSort(mydata);
        for (int i = 0; i < mydata.length; i++) {
            System.out.println(mydata[i]);
        }


    }

    public static void inverserInsertionSort(int data[]) {
        for (int j = 1; j < data.length; j++) {
            int key = data[j];
            int i = j - 1;
            while (i >= 0 && key > data[i]) {
                data[i + 1] = data[i];
                i = i - 1;
            }
            data[i + 1] = key;
        }
    }

}
// in this methot just one difference between inverse and normla insterstion sort

// Looking at the line 18 it seen key > data[i]