    package LeetCodeAndAlgorthm;

    import java.util.HashMap;
    import java.util.Hashtable;


    // this is nice question which is called basic in leetCode
    // it is accepted 51k in our world

    // this is full equzile for example if you every elemtn 5 times repeat it checks
    // not just one equalize

    public class RemoveLetterToEqualizeFrequencyLeetCode {
        public static void main(String[] args) {
            System.out.println(Equal("aazzbbb"));

        }
        public static  boolean Equal(String word) {
                int index=0;
                HashMap<Character, Integer> map = new HashMap();
                for (char c : word.toCharArray()) {
                    map.put(c, map.getOrDefault(c, 0) + 1);
                }
                for(int i=0; i< map.size()-1; i++) {
                    char c = word.charAt(i+1);
                    char b = word.charAt(i);
                    if(map.get(c)-(map.get(b))==0) {

                    }else{
                        if(Math.abs(map.get(c)-map.get(b))>1) {
                            return false;
                        }
                        index=index+Math.abs(map.get(c)-map.get(b));
                    }
                }
                if(index>2){
                    return false;

                }else{
                    return true;
                }
        }

    }
