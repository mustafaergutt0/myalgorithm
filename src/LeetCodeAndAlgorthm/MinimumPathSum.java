package LeetCodeAndAlgorthm;

import java.util.Arrays;

public class MinimumPathSum {
    static void main() {

           int data [][]={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(data));




    }



    static int minPathSum(int[][] grid) {

       // Dynamic Ptgoraming is requried
        // en alttan bşalsyığ sürekil üste çıkarak gidecegiz
        int m = grid.length;    //4
        int n = grid[0].length;   //4

        // Sağ alt köşeden geriye doğru tarıyoruz
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == m - 1 && j == n - 1) continue; // Bitiş noktası kalsın

                // "Sondan başa" giderken sağımızdaki ve altımızdaki TOPLAM maliyetlere bakıyoruz
                long sag = (j + 1 < n) ? grid[i][j + 1] : Integer.MAX_VALUE;
                long alt = (i + 1 < m) ? grid[i + 1][j] : Integer.MAX_VALUE;

                // En ucuz rotanın faturasını bu hücreye işle
                grid[i][j] += Math.min(sag, alt);
            }
        }
        return grid[0][0];


    }
}
