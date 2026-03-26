package LeetCodeAndAlgorthm;

import java.util.HashMap;

public class RestoreFinishenOrder {
    static void main() {


        int data1[]={3,1,2,5,4};
        int data2[]={1,3,4};
        System.out.println(recoerOrder(data1,data2));


    }


    public static int[] recoerOrder(int[] order, int [] friends){
        int orderarray []= new  int [friends.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<friends.length;i++){
            map.put(friends[i],map.getOrDefault(friends[i],0)+1);
        }
        int a=0;
        for(int i=0;i<order.length;i++){
            if(map.containsKey(order[i])){
                orderarray[a]=order[i];
                a++;
            }
        }

        return orderarray;


    }
}
