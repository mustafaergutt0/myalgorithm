package Lab9;

import java.util.Arrays;

public class RandomizeInPlace {
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
            int[] randomizedArray = randomizeInPlace(arr.clone()); // Clone array to preserve original
            System.out.println("Randomized Array " + (i + 1) + ": " + Arrays.toString(randomizedArray));
        }
    }

    public static int[] randomizeInPlace(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) { // Loop through all elements
            int randomIndex = i + (int) (Math.random() * (n - i)); // Generate random index from i to n-1
            // Swap elements
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        return arr;
    }
}
