package LeetCodeAndAlgorthm;

public class FindClosestPerson {
    static void main() {

        System.out.println(findClosest(2,5,6));

    }

    static int findClosest(int x,int y , int z){
        int far1=Math.abs(z-x);
        int far2=Math.abs(z-y);
        if(far1<far2){
            return 1;
        }if(far1==far2){
            return 0;
        }else{
            return 2;
        }



    }
}
