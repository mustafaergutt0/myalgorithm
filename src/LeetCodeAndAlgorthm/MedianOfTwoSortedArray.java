package LeetCodeAndAlgorthm;

public class MedianOfTwoSortedArray {

    // THİS İS LEED CODE PROBLEM
    // this is example of median of given two sorted array
    // your are taken two arrays which is sorted already but they are diffetent
    // then you will find median of given two array
    // sum them separetly and a


    public static void main(String[] args) {

    }
    final public  static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int[] mergedArray = new int[totalLength];

        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            mergedArray[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            mergedArray[k++] = nums2[j++];
        }
        if (totalLength % 2 == 0) {
            int mid1 = mergedArray[(totalLength / 2) - 1];
            int mid2 = mergedArray[totalLength / 2];
            return (double) (mid1 + mid2) / 2.0;
        } else {
            return mergedArray[totalLength / 2];
        }
    }
}

