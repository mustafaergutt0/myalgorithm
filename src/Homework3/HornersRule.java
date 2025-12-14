package Homework3;

public class HornersRule {
    public static void main(String[] args) {

        int data[]={2,5,8,1,2,5,589,5};
        long system=System.currentTimeMillis();
        System.out.println(Horners(data,25));
        long time=System.currentTimeMillis();
        System.out.println(time-system);


    }

    public static int Horners(int [] number ,int x){
        // it's loop willl take n*n time  theta because every it at leas work n*n every elemetn will checked
        int result =0;
        int n = number.length-1;
        for(int i =0;i<n;i++){
            int term=number[i];
            for(int j=i+1;j<n;j++){
                term*=x;
                result+=term;
            }
        }
        return result;


    }
}
