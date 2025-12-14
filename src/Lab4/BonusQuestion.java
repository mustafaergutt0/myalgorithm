package Lab4;

import java.util.Random;

public class BonusQuestion {




        // Brute-force yaklaşımı
        public static int[] brute_force(int[] A) {
            int maxDiff = Integer.MIN_VALUE;
            int i_max = 0, j_max = 0;

            for (int i = 0; i < A.length - 1; i++) {
                for (int j = i + 1; j < A.length; j++) {
                    int diff = A[j] - A[i];
                    if (diff > maxDiff) {
                        maxDiff = diff;
                        i_max = i + 1;  // 1-based indexing
                        j_max = j + 1;
                    }
                }
            }

            return new int[]{i_max, j_max, maxDiff};
        }

        // Divide and conquer yaklaşımı için methodlar
        public static int[] find_max_crossing_subarray(int[] A, int low, int mid, int high) {
            int left_sum = Integer.MIN_VALUE;
            int sum = 0;
            int max_left = mid;
            for (int i = mid; i >= low; i--) {
                sum += A[i];
                if (sum > left_sum) {
                    left_sum = sum;
                    max_left = i;
                }
            }

            int right_sum = Integer.MIN_VALUE;
            sum = 0;
            int max_right = mid + 1;
            for (int j = mid + 1; j <= high; j++) {
                sum += A[j];
                if (sum > right_sum) {
                    right_sum = sum;
                    max_right = j;
                }
            }

            return new int[]{max_left, max_right, left_sum + right_sum};
        }

        public static int[] find_maximum_subarray(int[] A, int low, int high) {
            if (low == high) {
                return new int[]{low, high, A[low]};
            } else {
                int mid = (low + high) / 2;
                int[] left = find_maximum_subarray(A, low, mid);
                int[] right = find_maximum_subarray(A, mid + 1, high);
                int[] cross = find_max_crossing_subarray(A, low, mid, high);

                if (left[2] >= right[2] && left[2] >= cross[2]) {
                    return left;
                } else if (right[2] >= left[2] && right[2] >= cross[2]) {
                    return right;
                } else {
                    return cross;
                }
            }
        }

        public static void main(String[] args) {
            Random rand = new Random();
            int n0 = -1;  // Brute-force'u geçen n₀

            // n boyutlarını büyütüp test edeceğiz
            for (int n = 16; n <= 65536; n *= 2) {
                int[] A = new int[n];
                for (int i = 0; i < n; i++) {
                    A[i] = rand.nextInt(100);
                }

                // Brute-force zaman ölçümü
                long startTime = System.nanoTime();
                brute_force(A);
                long bruteForceTime = System.nanoTime() - startTime;

                // Divide and conquer zaman ölçümü
                int[] diff_A = new int[A.length - 1];
                for (int i = 0; i < A.length - 1; i++) {
                    diff_A[i] = A[i + 1] - A[i];
                }

                startTime = System.nanoTime();
                find_maximum_subarray(diff_A, 0, diff_A.length - 1);
                long divideConquerTime = System.nanoTime() - startTime;

                // Sonuçları ekrana yazdır
                System.out.println("n = " + n + ": Brute Force Time (ns) = " + bruteForceTime + ", Divide and Conquer Time (ns) = " + divideConquerTime);

                // Eğer divide and conquer daha hızlıysa n₀ bulundu
                if (divideConquerTime < bruteForceTime && n0 == -1) {
                    n0 = n;
                }
            }

            // n₀ sonucunu yazdır
            if (n0 != -1) {
                System.out.println("Divide and conquer brute-force'u n₀ = " + n0 + " boyutunda geçti.");
            } else {
                System.out.println("Divide and conquer brute-force'u henüz geçmedi.");
            }
        }
    }




