package Lab9;

import java.util.Arrays;

public class PermuteWithAll {
    public static void main(String[] args) {
        // Initialize an array of size 10 with random numbers from 0 to 99
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100); // Random numbers from 0 to 99
        }

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Generate 5 permutations and print them
        for (int i = 0; i < 5; i++) {
            int[] permutedArray = permuteWithAll(arr.clone()); // Clone array to preserve original
            System.out.println("Permuted Array " + (i + 1) + ": " + Arrays.toString(permutedArray));
        }
    }

    public static int[] permuteWithAll(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) { // Loop through all elements
            int randomIndex = (int) (Math.random() * n); // Generate random index from 0 to n-1
            // Swap elements
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        return arr;
    }
}
