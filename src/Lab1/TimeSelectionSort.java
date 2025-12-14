package Lab1;

import java.util.Random;

public class TimeSelectionSort {

    public static void main(String[] args) {
        Random rand = new Random();

        for (int size : new int[]{1000, 10000}) {
            long minTime = Long.MAX_VALUE;
            long maxTime = Long.MIN_VALUE;
            long totalTime = 0;

            for (int i = 0; i < 1000; i++) {
                int[] arr = new int[size];
                for (int j = 0; j < size; j++) {
                    arr[j] = rand.nextInt(10000);
                }

                long startTime = System.nanoTime();
                SelectionSort.selectionSort(arr);
                long endTime = System.nanoTime();
                long elapsedTime = endTime - startTime;

                minTime = Math.min(minTime, elapsedTime);
                maxTime = Math.max(maxTime, elapsedTime);
                totalTime += elapsedTime;
            }

            System.out.println("Sorting " + size + " integers:");
            System.out.println("Minimum time: " + minTime + " ns");
            System.out.println("Average time: " + totalTime / 1000 + " ns");
            System.out.println("Maximum time: " + maxTime + " ns");


        }
    }

}
