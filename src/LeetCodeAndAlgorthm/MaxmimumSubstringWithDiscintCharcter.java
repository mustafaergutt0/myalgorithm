package LeetCodeAndAlgorthm;

import java.util.HashMap;

public class MaxmimumSubstringWithDiscintCharcter {
    static void main() {


        System.out.println(MaxSubstring_DiscintCharcter("abab"));
    }

    public static  int MaxSubstring_DiscintCharcter(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int ans = map.size();
        return ans;
    }
}
