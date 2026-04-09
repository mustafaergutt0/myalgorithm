package LeetCodeAndAlgorthm;

public class GasStation {
    // hairka bri algortima gas ve cost var bir adım sonrasına geçmek i.in gereken gas station fulleyebilriyorsun

    // gasstaion doldur costu hesapla git

    static void main() {

    }


    static  public int canCompleteCircuit(int[] gas, int[] cost) {
        int Totaltank=0;
        int currenttank=0;
        int starting=0;
        for(int i=0;i<gas.length;i++){
            int diff=gas[i]-cost[i];
            Totaltank+=diff;
            currenttank+=diff;


            if(currenttank<0){
                starting=i+1;
                currenttank=0;
            }
        }
        if(Totaltank<0){
            return -1;
        }else{
            return starting;
        }
    }
}
