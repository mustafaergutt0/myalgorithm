
import java.util.Arrays;
import java.util.Random;

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
    int[] count = new int[10]; // There are 10 digits (0 to 9)
    Arrays.fill(count, 0);

    // Count occurrences of each digit
    for (int num : array) {
        int digit = (num / place) % 10;
        count[digit]++;
    }

    // Compute cumulative count
    for (int i = 1; i < 10; i++) {
        count[i] += count[i - 1];
    }

    // Build the output array
    for (int i = array.length - 1; i >= 0; i--) {
        int digit = (array[i] / place) % 10;
        output[count[digit] - 1] = array[i];
        count[digit]--;
    }

    // Copy the sorted elements back to the original array
    System.arraycopy(output, 0, array, 0, array.length);
}



    public static void main(String[] args) {
        int[] testArray = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            testArray[i] = rand.nextInt(90) + 10; // Generate random two-digit numbers
        }

        System.out.println("Original Array:");
        print_array(testArray);

        radix_sort(testArray);

        System.out.println("Sorted Array:");
        print_array(testArray);
    }

    public static void print_array(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }




