package lab12;

import java.util.Arrays;
import java.util.Random;

public class SortingComparsion {

    public static void main(String[] args) {
        int inputSize = 100000000;
        Random rand = new Random();
        int[] largeArray = new int[inputSize];
        for (int i = 0; i < inputSize; i++) {
            largeArray[i] = rand.nextInt(900) + 100; // Generate random three-digit numbers
        }

        long startTime, endTime;

        System.out.println("Running experiments for input size 100,000,000 and range 100-999...");

        // Radix Sort
        int[] arrayCopy = Arrays.copyOf(largeArray, largeArray.length);
        System.gc(); // Suggest garbage collection to free up memory
        startTime = System.nanoTime();
        radix_sort(arrayCopy);
        endTime = System.nanoTime();
        System.out.printf("Radix Sort Time: %d ns\n", (endTime - startTime));
        System.out.println("Observe RAM usage for Radix Sort now.");
        pauseExecution();

        // Counting Sort
        arrayCopy = Arrays.copyOf(largeArray, largeArray.length);
        System.gc();
        startTime = System.nanoTime();
        counting_sort(arrayCopy);
        endTime = System.nanoTime();
        System.out.printf("Counting Sort Time: %d ns\n", (endTime - startTime));
        System.out.println("Observe RAM usage for Counting Sort now.");
        pauseExecution();

        // Merge Sort
        arrayCopy = Arrays.copyOf(largeArray, largeArray.length);
        System.gc();
        startTime = System.nanoTime();
        merge_sort(arrayCopy, 0, arrayCopy.length - 1);
        endTime = System.nanoTime();
        System.out.printf("Merge Sort Time: %d ns\n", (endTime - startTime));
        System.out.println("Observe RAM usage for Merge Sort now.");
        pauseExecution();

        // Heap Sort
        arrayCopy = Arrays.copyOf(largeArray, largeArray.length);
        System.gc();
        startTime = System.nanoTime();
        heap_sort(arrayCopy);
        endTime = System.nanoTime();
        System.out.printf("Heap Sort Time: %d ns\n", (endTime - startTime));
        System.out.println("Observe RAM usage for Heap Sort now.");
        pauseExecution();
    }

    public static void pauseExecution() {
        try {
            System.out.println("Pausing for observation. Press Enter to continue...");
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void radix_sort(int[] array) {
        int maxNumber = Arrays.stream(array).max().getAsInt();
        int place = 1; // Initialize place value

        while (maxNumber / place > 0) {
            counting_sort_for_radix(array, place);
            place *= 10; // Move to the next place value
        }
    }

    public static void counting_sort_for_radix(int[] array, int place) {
        int[] output = new int[array.length];
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (int num : array) {
            int digit = (num / place) % 10;
            count[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            int digit = (array[i] / place) % 10;
            output[count[digit] - 1] = array[i];
            count[digit]--;
        }

        System.arraycopy(output, 0, array, 0, array.length);
    }

    public static void counting_sort(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[array.length];

        for (int num : array) {
            count[num - min]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            output[count[array[i] - min] - 1] = array[i];
            count[array[i] - min]--;
        }

        System.arraycopy(output, 0, array, 0, array.length);
    }

    public static void merge_sort(int[] array, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(array, p, q);
            merge_sort(array, q + 1, r);
            merge(array, p, q, r);
        }
    }

    public static void merge(int[] array, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = array[p + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = array[q + 1 + j];
        }

        int i = 0, j = 0, k = p;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    public static void heap_sort(int[] array) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    public static void heapify(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapify(array, n, largest);
        }
    }
}
