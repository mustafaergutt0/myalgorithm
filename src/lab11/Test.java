package lab11;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int inputSize = 100000000; // 100 milyon eleman
        int[] array = new Random().ints(inputSize, 0, 10000000).toArray(); // 0 - 9,999,999 aralığında sayı üret
//1230
      //  System.out.println("Counting Sort Running...");
       // countingSort(array.clone(), 9999999); // Counting Sort
//1256
        System.out.println("Merge Sort Running...");
        mergeSort(array.clone()); // Merge Sort
//826
       // System.out.println("Heap Sort Running...");
        //heapSort(array.clone()); // Heap Sort

        System.out.println("Sorting completed. Check RAM usage with `top` command.");
    }

    public static void countingSort(int[] array, int range) {
        int n = array.length;
        int[] count = new int[range + 1];
        int[] output = new int[n];

        for (int num : array) count[num]++;
        for (int i = 1; i <= range; i++) count[i] += count[i - 1];
        for (int i = n - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }
        System.arraycopy(output, 0, array, 0, n);
    }

    public static void mergeSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < n1) array[k++] = leftArray[i++];
        while (j < n2) array[k++] = rightArray[j++];
    }

    public static void heapSort(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) heapify(array, n, i);
        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest]) largest = left;
        if (right < n && array[right] > array[largest]) largest = right;

        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
            heapify(array, n, largest);
        }
    }
}

