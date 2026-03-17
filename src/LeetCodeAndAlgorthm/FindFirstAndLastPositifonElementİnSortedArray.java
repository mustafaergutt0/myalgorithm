package LeetCodeAndAlgorthm;

public class FindFirstAndLastPositifonElementİnSortedArray {
    public static void main(String[] args) {
        // Test etmek istersen burayı kullanabilirsin
    }

    static public int[] searchRange(int[] nums, int target) {
        int result[] = {-1, -1};

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                // Sayıyı bulduk! Şimdi senin mantığınla sağa ve sola daralarak gidelim.
                int left = mid;
                int right = mid;

                // 1. En Solu (First) bulmak için ayrı bir Binary Search
                int tempLow = low;
                int tempMidHigh = mid;
                while (tempLow <= tempMidHigh) {
                    int leftMid = tempLow + (tempMidHigh - tempLow) / 2;
                    if (nums[leftMid] == target) {
                        left = leftMid; // Bulduk ama daha sola bakmalıyız
                        tempMidHigh = leftMid - 1;
                    } else {
                        tempLow = leftMid + 1;
                    }
                }

                // 2. En Sağı (Last) bulmak için ayrı bir Binary Search
                int tempMidLow = mid;
                int tempHigh = high;
                while (tempMidLow <= tempHigh) {
                    int rightMid = tempMidLow + (tempHigh - tempMidLow) / 2;
                    if (nums[rightMid] == target) {
                        right = rightMid; // Bulduk ama daha sağa bakmalıyız
                        tempMidLow = rightMid + 1;
                    } else {
                        tempHigh = rightMid - 1;
                    }
                }

                result[0] = left;
                result[1] = right;
                return result; // İki sınırı da bulunca hemen döndürüyoruz
            }

            // Standart Binary Search yönlendirmeleri
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }
}