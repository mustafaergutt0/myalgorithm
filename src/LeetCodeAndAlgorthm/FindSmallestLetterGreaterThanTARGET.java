package LeetCodeAndAlgorthm;

public class FindSmallestLetterGreaterThanTARGET {
    static void main() {

    }


    public char nextGreatestLetter(char[] letters, char target) {
        char b = letters[0];  // eğer hiç bir şey yoksa direk onu dön

        for(char c: letters){
            if(c>target){
                return c; //  ilk dörgüğünü dönüğü için direk bu oluyıor
            }
        }

        return b;

    }
}
