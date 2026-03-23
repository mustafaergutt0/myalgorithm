package LeetCodeAndAlgorthm;

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi("-4255"));

    }

     public static int myAtoi(String s) {
      // Strig to Integer medium quesito is hard ever seen befor
          // for negative and positive ınteger
        int i=0;
        int n = s.length();
        int seen=1;

        long count=0;
        // iki tane while koyduk bir tanesi direk boşlukları temizkemk için

        while(i<n && s.charAt(i)==' '){
            i++;
        }

         if(i<n &&  (s.charAt(i)=='-'  || s.charAt(i)=='+' ) ){
             seen = (s.charAt(i) == '-') ? -1 : 1;
             i++;
         }

        while(i<n && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            count=count*10+digit;

            if(seen==1 && count>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }if(seen==-1 && -count<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }   // tam olarak 32 ile 36 arası senior seviye kod koyma olayı
            i++;

        }


        return  (int) (count*seen);





    }
}




