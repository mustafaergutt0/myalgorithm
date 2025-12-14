package Lab4;

public class Maxarray {

    /// brutce force is storng power like
    // we open two loop whicch increase time comp o (n*n)
    // it checks while keeping ai]

        public static void myforce(int[] A) {
            int maxDiff = Integer.MIN_VALUE;
            int iIndex = 0;
            int jIndex = 0;

            for (int i = 0; i < A.length - 1; i++) {
                for (int j = i + 1; j < A.length; j++) {
                    int fark = A[j] - A[i];
                    if (fark > maxDiff) {
                        maxDiff = fark;
                        iIndex = i + 1;
                        jIndex = j + 1;
                    }
                }
            }
            System.out.println("i=" + iIndex + " j=" + jIndex + " Maximum difference=" + maxDiff);
        }

        public static void main(String[] args) {


            int[] test_A = FillBox(65536);
            long startTime = System.nanoTime();
            myforce(test_A);
            long endTime = System.nanoTime();
            long  elapsedTime = endTime - startTime;
            System.out.println(elapsedTime);

        }


// ı filled the array my program , ı coded
    public  static int[] FillBox(int number){
        int mybox[]=new int[number];
        for(int i=0;i<number;i++){
            int num= (int) (Math.random()*100);
            mybox[i]=num;
        }
        return mybox;
    }
    }


