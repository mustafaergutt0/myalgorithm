package LeetCodeAndAlgorthm;

public class FindNumberWithEvenDİgitsLeetCode {
    public static void main(String[] args) {

        int data[]={2,3,54,12,4,14,25411,5,14225,4425,2525};
        System.out.println(findNumbers(data));

    }


    public  static int findNumbers(int[] nums) {
        int howmany = 0;
        // 1) Döngü nums.length kadar dönsün
        for (int i = 0; i < nums.length; i++) {
            if (hasEvenDigits(nums[i])) {
                howmany++;
            }
        }
        // 2) Sayacı ancak tüm döngü bittikten sonra döndür
        return howmany;
    }

    // isimlendirmeyi Java standartlarına göre küçük harfle başlatmak daha uygun
    public static boolean hasEvenDigits(int number) {
        int count = 0;
        // 3) number her seferinde bölünsün
        while (number > 0) {
            number = number / 10;
            count++;
        }
        // basamak sayısı çift mi diye bak
        return count % 2 == 0;
    }
}
