package LeetCodeAndAlgorthm;
/*

A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

For example, "Hello World", "HELLO", "hello world hello world" are all sentences.
Words consist of only uppercase and lowercase English letters. Uppercase and lowercase English letters are considered different.

A sentence is circular if:

The last character of a word is equal to the first character of the next word.
The last character of the last word is equal to the first character of the first word.
For example, "leetcode exercises sound delightful", "eetcode", "leetcode eats soul" are all circular sentences. However, "Leetcode is cool", "happy Leetcode", "Leetcode" and "I like Leetcode" are not circular sentences.

Given a string sentence, return true if it is circular. Otherwise, return false.







 */


public class CircularSenteceLeetCode {
    public static void main(String[] args) {
        System.out.println(isCircularSentence("MustafA Arkdasımın nerdesin na amaınacaktığıM"));
    }

    public  static boolean isCircularSentence(String sentence) {
        String sen[] = sentence.split(" ");  // you should know between "" and " " respectivly it controls character and words in terms of sperating operating
        for (int i = 0; i < sen.length - 1; i++) {
            if (sen[i].charAt(sen[i].length() - 1) != sen[i + 1].charAt(0)) { // firsWords last charhctes is cheking with firschater of second words
                return false;
            }else{

                System.out.println((sen[i].charAt(sen[i].length() - 1) + sen[i + 1].charAt(0)));
            }
        }
        return sentence.charAt(0) == sentence.charAt(sentence.length() - 1);

        // finally line 42 is checked beacuse first charachter of first words have to be equals to last words' last charchater
    }

}
