package LeetCodeAndAlgorthm;

public class FİnalvalueafterOperations {




    static void main() {
        String mystirng []={"--X","X++","X++"};

        System.out.println(finalvalue(mystirng));
    }



    static final int finalvalue(String [] operations){

        int count =0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].contains("+")){
                count++;
                continue;
            }else{
                count--;
                continue;

            }

        }

        return count;

    }
}
