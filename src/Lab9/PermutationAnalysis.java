package Lab9;

import java.util.Arrays;
import java.util.HashMap;

public class PermutationAnalysis {
    public static void main(String[] args) {
        // Initialize the array [1, 2, 3, 4]
        int[] arr = {1, 2, 3, 4};
        int iterations = 24000; // Number of times to permute
        HashMap<String, Integer> randomizeInPlaceFrequencies = new HashMap<>();
        HashMap<String, Integer> permuteWithAllFrequencies = new HashMap<>();

        // Perform RANDOMIZE-IN-PLACE
        for (int i = 0; i < iterations; i++) {
            int[] randomizedArray = randomizeInPlace(arr.clone());
            String permutation = Arrays.toString(randomizedArray);
            randomizeInPlaceFrequencies.put(permutation, randomizeInPlaceFrequencies.getOrDefault(permutation, 0) + 1);
        }

        // Perform PERMUTE-WITH-ALL
        for (int i = 0; i < iterations; i++) {
            int[] permutedArray = permuteWithAll(arr.clone());
            String permutation = Arrays.toString(permutedArray);
            permuteWithAllFrequencies.put(permutation, permuteWithAllFrequencies.getOrDefault(permutation, 0) + 1);
        }

        // Print results for RANDOMIZE-IN-PLACE
        System.out.println("RANDOMIZE-IN-PLACE Results:");
        randomizeInPlaceFrequencies.forEach((key, value) -> System.out.println(key + ": " + value));

        // Print results for PERMUTE-WITH-ALL
        System.out.println("\nPERMUTE-WITH-ALL Results:");
        permuteWithAllFrequencies.forEach((key, value) -> System.out.println(key + ": " + value));
        // Print results side by side
        System.out.println("Permutation\tRANDOMIZE-IN-PLACE\tPERMUTE-WITH-ALL");

// Iterate through all possible permutations
        for (String permutation : randomizeInPlaceFrequencies.keySet()) {
            int randomizeCount = randomizeInPlaceFrequencies.getOrDefault(permutation, 0);
            int permuteCount = permuteWithAllFrequencies.getOrDefault(permutation, 0);
            System.out.printf("%s\t\t%d\t\t\t%d\n", permutation, randomizeCount, permuteCount);
        }

    }

    // RANDOMIZE-IN-PLACE implementation
    public static int[] randomizeInPlace(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int randomIndex = i + (int) (Math.random() * (n - i));
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        return arr;
    }

    // PERMUTE-WITH-ALL implementation
    public static int[] permuteWithAll(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int randomIndex = (int) (Math.random() * n);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        return arr;
    }
}
