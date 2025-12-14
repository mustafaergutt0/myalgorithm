package LeetCodeAndAlgorthm;

import Lab7.matrix;

public class Search2DMatrixLeetCode {
    public static void main(String[] args) {
        int data[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(data.length);
        System.out.println(data[0].length);

    }



    public static boolean BruteForcesearchMatrix(int[][] matrix, int target) {
        // this way brute force o n*n
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;

        }else{
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == target) {
                        return true;
                    }
                }
            }
        }
        return  false;
    }



    public static boolean Search2DMatrix(int[][] matrix, int target) {
        int rowNumber=matrix.length;
        int colNumber=matrix[0].length;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        return  false;

    }


    int binarySearch(int arr[], int low, int high, int x)
    {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, low, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, high, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
}
