package Lab5;

public class Matrsik1616 {
    public static void main(String[] args) {
        int data1[][]= CreateArray(16);
        int data2[][]= CreateArray(16);

        long system=System.nanoTime();
        int newmatriks[][]=Matrisk.data(data1,data2);
        long time=System.nanoTime();
        long time2=time-system;
        System.out.println(time2);


    }


    public static int[][] CreateArray(int n ) {
        int[][] data = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                data[i][j] = (int)(Math.random()*100);
            }
        }

        return data;

    }



}
