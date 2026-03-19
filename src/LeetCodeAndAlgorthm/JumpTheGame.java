package LeetCodeAndAlgorthm;

public class JumpTheGame {
    static void main() {

    }


    static public boolean JumpTheGame(int[] arr) {

        if (arr.length <= 1) return true;  // birden küçüksen zaten direk bir dön son indexten

            //hey güncxelelem
        for (int i = 0; i < arr.length; i++) {


            if (arr[i] == 0 && i != arr.length - 1) {

                boolean bariyeriAstiMi = false;


                for (int j = i - 1; j >= 0; j--) {


                    if (j + arr[j] > i) { // çünkü indexin üzierne sayacagız örnegin sıfır 5 indexte bir geride 4 index var j
                        bariyeriAstiMi = true;
                        break;

                    }
                }

                if (!bariyeriAstiMi) {
                    return false;
                }
            }
        }
        return true;

    }


}