package LeetCodeAndAlgorthm.MyAlgortihm;

/*
Problem: Implement a function generateNumber(int first, int last) that generates
a random integer in the range [first, last], using only a randomBit() function
that returns 0 or 1 with equal probability.

Constraints:
1. You can only call randomBit() to generate random numbers.
2. The output must be uniformly distributed across the range [first, last].

Plan:
1. Calculate the range of numbers [first, last] as `range = last - first + 1`.
2. Determine how many bits are required to represent `range` using the formula:
   numBits = ceil(log2(range)).
3. Use randomBit() to generate a binary number with numBits bits.
4. If the binary number falls outside [0, range - 1], reject it and repeat.
5. Shift the result to [first, last] by adding `first` to the generated number.
6. Return the result.
*/

import java.util.Random;

public class RandomNumberGenerator {

    // Main function for testing
    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator();

        // Test: Generate random numbers in the range [10, 15]
        int randomNum = rng.generateNumber(1, 15);
        System.out.println("Generated Random Number: " + randomNum);
    }

    public int generateNumber(int first, int last) {
        // Function to generate a random number in the range [first, last]

            // Step 1: Calculate the range of numbers
            int range = last - first + 1;

            // Step 2: Calculate the number of bits required to represent the range
            int numBits = (int) Math.ceil(Math.log(range) / Math.log(2));

            int result; // The final result to be returned

            // Step 3: Generate random numbers until a valid one is found
            do {
                result = 0; // Start with 0
                for (int i = 0; i < numBits; i++) {
                    result = (result << 1) | randomBit(); // Shift left and add random bit
                }
            } while (result >= range); // Reject numbers outside the valid range

            // Step 4: Shift the result to the range [first, last]
            return first + result;
        }

        // Helper function that simulates a randomBit() call, returning 0 or 1
        public static int randomBit() {
            Random random = new Random();
            return random.nextInt(2); // Randomly return 0 or 1
        }
    }



