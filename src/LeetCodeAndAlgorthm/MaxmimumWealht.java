package LeetCodeAndAlgorthm;

public class MaxmimumWealht {
    static void main() {

    }


    static  public int maxmimumWelath (int [][] accounts){
        int totalmax=0;

        int row=accounts.length;
        int col=accounts[0].length;
        for(int i=0;i<accounts.length;i++){
            int tempro=0;
            for(int j=0;j<accounts[0].length;j++){
                tempro=tempro+accounts[i][j];
            }
            totalmax=Math.max(tempro,totalmax);
        }


        return totalmax;
    }
}
