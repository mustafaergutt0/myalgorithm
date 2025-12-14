package LeetCodeAndAlgorthm;

import java.util.HashMap;
import java.util.Map;

public class CountLargestGroup {
    public static void main(String[] args) {
        System.out.println(countLargestGroup(13));
    }

    public static int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) { // Döngü 1'den nums'a kadar gitmeli
            int digitSum = ReturnDigitSums(i);
            map.put(digitSum, map.getOrDefault(digitSum, 0) + 1);
        }

        int maxCount = 0;
        for (int count : map.values()) {
            maxCount = Math.max(maxCount, count);
        }

        int largestGroupCount = 0;
        for (int count : map.values()) {
            if (count == maxCount) {
                largestGroupCount++;
            }
        }
        return largestGroupCount;
    }

    public static int ReturnDigitSums(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}