package LeetCodeAndAlgorthm;

import java.util.ArrayList;
import java.util.List;

public class SelfDividngNumber {
    static void main() {

    }


    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            int coun=0;
            // öcnelike hepsini String çevir
            String my=Integer.toString(i);
            if(my.contains("0")){
            }else{
                for(int b=0;b<my.length();b++){
                    char c=my.charAt(b);
                    int number= c -'0';
                    if(i%number==0){
                        coun++;
                    }

                }
                if(coun==my.length()){
                    list.add(i);
                }
            }




        }

        return list;

    }
}
