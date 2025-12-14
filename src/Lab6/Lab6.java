package Lab6;

import java.sql.SQLOutput;

public class Lab6 {
    public static void main(String[] args) {

        int[][] A = CreateArray(640);
        int[][] B = CreateArray(640);

        // Strassen metodu çağrılıyor ve sonucu bir matrise atıyoruz
        long s=System.nanoTime();
        int[][] C = strassen(A,B);
        long e=System.nanoTime();
        long d=e-s;
        System.out.println(d);

// everything we are asked , we treied and reported the document 
    }

    public static int[][] squareMatrixMultiply(int[][] A, int[][] B) {
        int n = A.length; // Matris boyutu (n x n)
        int[][] C = new int[n][n];

        // Standart matris çarpımı
        for (int i = 0; i < n; i++) { // A matrisinin satırları
            for (int j = 0; j < n; j++) { // B matrisinin sütunları
                C[i][j] = 0; // Başlangıç değeri
                for (int k = 0; k < n; k++) { // Ortak boyut (çarpanlar)
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C; // Çarpım matrisi
    }


    public static int[][] strassen(int[][] A, int[][] B) {
        int n = A.length;

        // Temel durum: 1x1 matris
        if (n == 1) {
            int[][] C = new int[1][1];
            C[0][0] = A[0][0] * B[0][0];
            return C;
        }

        int newSize = n / 2;

        // Alt matrisleri ayırma
        int[][] A11 = new int[newSize][newSize];
        int[][] A12 = new int[newSize][newSize];
        int[][] A21 = new int[newSize][newSize];
        int[][] A22 = new int[newSize][newSize];

        int[][] B11 = new int[newSize][newSize];
        int[][] B12 = new int[newSize][newSize];
        int[][] B21 = new int[newSize][newSize];
        int[][] B22 = new int[newSize][newSize];

        // Matrisleri böl
        splitMatrix(A, A11, 0, 0);
        splitMatrix(A, A12, 0, newSize);
        splitMatrix(A, A21, newSize, 0);
        splitMatrix(A, A22, newSize, newSize);

        splitMatrix(B, B11, 0, 0);
        splitMatrix(B, B12, 0, newSize);
        splitMatrix(B, B21, newSize, 0);
        splitMatrix(B, B22, newSize, newSize);

        // Ara hesaplamalar
        int[][] S1 = subtract(B12, B22);
        int[][] S2 = add(A11, A12);
        int[][] S3 = add(A21, A22);
        int[][] S4 = subtract(B21, B11);
        int[][] S5 = add(A11, A22);
        int[][] S6 = add(B11, B22);
        int[][] S7 = subtract(A12, A22);
        int[][] S8 = add(B21, B22);
        int[][] S9 = subtract(A11, A21);
        int[][] S10 = add(B11, B12);

        // Strassen'in P hesaplamaları
        int[][] P1 = strassen(A11, S1);
        int[][] P2 = strassen(S2, B22);
        int[][] P3 = strassen(S3, B11);
        int[][] P4 = strassen(A22, S4);
        int[][] P5 = strassen(S5, S6);
        int[][] P6 = strassen(S7, S8);
        int[][] P7 = strassen(S9, S10);

        // C matrisini birleştirme
        int[][] C11 = add(subtract(add(P5, P4), P2), P6);
        int[][] C12 = add(P1, P2);
        int[][] C21 = add(P3, P4);
        int[][] C22 = subtract(subtract(add(P5, P1), P3), P7);

        int[][] C = new int[n][n];
        joinMatrix(C11, C, 0, 0);
        joinMatrix(C12, C, 0, newSize);
        joinMatrix(C21, C, newSize, 0);
        joinMatrix(C22, C, newSize, newSize);

        return C;
    }

    public static void splitMatrix(int[][] parent, int[][] child, int rowOffset, int colOffset) {
        for (int i = 0; i < child.length; i++) {
            for (int j = 0; j < child.length; j++) {
                child[i][j] = parent[i + rowOffset][j + colOffset];
            }
        }
    }

    public static void joinMatrix(int[][] child, int[][] parent, int rowOffset, int colOffset) {
        for (int i = 0; i < child.length; i++) {
            for (int j = 0; j < child.length; j++) {
                parent[i + rowOffset][j + colOffset] = child[i][j];
            }
        }
    }

    public static int[][] add(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    public static int[][] subtract(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        return C;
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
