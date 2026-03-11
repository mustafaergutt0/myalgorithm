package LeetCodeAndAlgorthm;

import java.math.BigInteger;

public class FindSmallestİndex {
    // Java'da programın başlaması için String[] args parametresi şarttır
    public static void main(String[] args) {

        int data[] = {813, 974, 946, 966, 915, 924, 812, 1000, 891, 875, 989, 656, 991, 806, 818, 999, 971, 276, 923, 997, 992, 943, 983, 811, 909, 990, 924, 991, 726, 818, 969, 690, 996, 784, 992, 949, 915, 931, 932, 821, 699, 688, 712, 805, 849, 489, 406, 482, 777, 974, 479, 237, 963, 903, 957, 995, 814, 864, 832, 889, 936, 467, 831, 970, 757, 646, 962, 987, 885, 924, 918, 710, 763, 839, 860, 888, 971, 994, 339, 253, 564, 759, 68, 747, 797, 716, 939, 987, 68, 953, 1000, 298, 10, 1, 1, 1, 1, 1, 48, 1, 77, 2};

        System.out.println(smallestBalancedIndex(data));
    }



    static int smallestBalancedIndex(int[] nums) {

        // tüm dizinin toplamı
        long leftSum = 0;
        for (int x : nums) {
            leftSum += x;
        }

        // sağ tarafın çarpımı
        long rightProduct = 1;

        // sağdan sola ilerle
        for (int i = nums.length - 1; i >= 0; i--) {

            // i indexini soldan çıkar
            leftSum -= nums[i];

            // kontrol
            if (leftSum == rightProduct) {
                return i;
            }

            // overflow ve gereksiz hesaplamayı engelle
            if (nums[i] != 0 && rightProduct > leftSum / nums[i]) {
                break;  // normalde olay şu rightprodcut* nums > leftsum düşün zaten direk neden çünkü right produc büyütedk gidecek
            }

            // sağ çarpımı güncelle
            rightProduct *= nums[i];
        }

        return -1;
    }


}