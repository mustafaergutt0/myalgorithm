package LeetCodeAndAlgorthm;

//  we are returing first apperence second given string in first string
// if there is no exist we retunr -1




public class FirstİndexOccurence {


    public static void main(String[] args) {

        String one="leetcode";
        String two="leto";
        System.out.println(strStr(one,two));

    }



    public static  int strStr(String haystack, String needle) {
        if ((haystack == null || needle == null) || (haystack.length()
                < needle.length()) || !haystack.contains(needle)) {
            return -1;
        } else {
            for (int i = 0; i < haystack.length() ; i++) {
                int lenght = needle.length();
                if(haystack.substring(i,i+lenght).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
