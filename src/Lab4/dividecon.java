package Lab4;

public class dividecon {

        // find_max_crossing_subarray methodu
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

        // find_maximum_subarray methodu
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
        // diff_test_A dizisini kullanarak test yapıyoruz
        int[] diff_test_A = {1, -4, 3, -4};
        int[] result = find_maximum_subarray(diff_test_A, 0, diff_test_A.length - 1);
        System.out.println("Left index: " + ((result[0]) +1 ) + ", Right index: " + ((result[1]) +1 )+ ", Max difference: " + result[2]);
    }






}
