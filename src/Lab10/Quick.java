package Lab10;


// Quick.java with heap_sort and merge_sort included
import java.util.Arrays;
import java.util.Random;

public class Quick {

    public static void main(String[] args) {


        long l = 67108864;

        int[] array=new int[Math.toIntExact(l)];
        for (long i = 0; i < l; i++) {
             array = generateRandomArray((int) l,0,99);

        }


            int[] quickArray = array.clone();
           //quickSort(array,0,array.length-1);

             merge_sort(quickArray,0,quickArray.length-1);

           // heap_sort(quickArray);





    }

    public static int[] generateRandomArray(int size, int min, int max) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(max - min + 1) + min;
        }
        return array;
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void heap_sort(int[] A) {
        int temp;
        int array_size = A.length;
        build_max_heap(A);

        for (int i = A.length; i >= 2; i--) {
            temp = A[0];
            A[0] = A[i - 1];
            A[i - 1] = temp;
            array_size--;
            max_heapify(A, array_size, 1);
        }
    }

    public static void max_heapify(int[] A, int array_size, int i) {
        int left_index, right_index, index_of_largest;
        int temp;

        left_index = 2 * i;
        right_index = 2 * i + 1;

        if (left_index <= array_size && A[left_index - 1] > A[i - 1])
            index_of_largest = left_index;
        else
            index_of_largest = i;

        if (right_index <= array_size && A[right_index - 1] > A[index_of_largest - 1])
            index_of_largest = right_index;

        if (index_of_largest != i) {
            temp = A[i - 1];
            A[i - 1] = A[index_of_largest - 1];
            A[index_of_largest - 1] = temp;
            max_heapify(A, array_size, index_of_largest);
        }
    }

    public static void build_max_heap(int[] A) {
        int middle_index = (int) Math.floor(A.length / 2);
        int array_size = A.length;

        for (int i = middle_index; i >= 1; i--)
            max_heapify(A, array_size, i);
    }

    public static void merge_sort(int[] A, int p, int r) {
        int q;

        if (p < r) {
            q = (int) Math.floor((p + r) / 2);
            merge_sort(A, p, q);
            merge_sort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    public static void merge(int[] A, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = A[p + i];

        for (int i = 0; i < n2; i++)
            R[i] = A[q + 1 + i];

        int i = 0, j = 0, k = p;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            A[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            A[k] = R[j];
            j++;
            k++;
        }
    }
}

