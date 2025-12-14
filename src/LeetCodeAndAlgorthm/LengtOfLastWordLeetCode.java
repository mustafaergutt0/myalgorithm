package LeetCodeAndAlgorthm;

public class LengtOfLastWordLeetCode {

    // you have sentences or some word
    // it returns final words lenght

    // every situation every word is split by split methot and to be put in array
    // exactly one solution there is no of course
    //  return  lenght of final index of array
    // it give you to gain prize


    public static void main(String[] args) {
        System.out.println( lengthOfLastWord("helel o dflafd fsaac   sfasd"));

    }


    public  static int lengthOfLastWord(String s) {
        // firslty you have split every words  and put words arrays
        String[] words = s.split(" ");
        // now  return function initiate last word.lenght
        return words[words.length - 1].length();
    }
}
