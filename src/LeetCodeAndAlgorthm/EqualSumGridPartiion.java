package LeetCodeAndAlgorthm;

public class EqualSumGridPartiion {
    static void main() {


        int data [][]={{1,3},{2,4}};
        System.out.println(canPartionEqaul(data));

    }

  // 25/03/2026 Mediium gülnük soru



    static  public boolean canPartionEqaul(int[][] grid) {

        // problem şu long olamlıa değerler

        int row= grid.length;
        int col= grid[0].length;

        boolean result=false;
        // mantık şu öncelike içindeki tüm elemanlıar tpolmamaız lazımmm
        int sumArray=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sumArray+=grid[i][j];
            }
        }  // sum bulduk şimdi hortical ve verizontol olarak bakacagız7

        long vertical=0;
        long horizontal=0;

        for(int i=0;i<row-1;i++){
            for(int j=0;j<col;j++){
                vertical+=grid[i][j];
            }
            if(vertical==(sumArray/2)){
                result=true;
            }
        }

        for(int j=0;j<col-1;j++){
            for(int k=0;k<row;k++){
                horizontal+=grid[k][j];

            }
            if(horizontal==(sumArray/2)){
                result=true;
            }
        }
        return  result;
    }
}
