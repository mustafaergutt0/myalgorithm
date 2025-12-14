package Lab5;

public class RecursiveCompare {
    public static void main(String[] args) {

        int data1[][]=Matrsik1616.CreateArray(16);
        int data2[][]=Matrsik1616.CreateArray(16);
        long   startTime = System.nanoTime();
        SquareMatriksrecırsive.recursiveMultiply(data1,data2);
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);

    }
}
