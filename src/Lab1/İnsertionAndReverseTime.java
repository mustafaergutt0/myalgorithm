package Lab1;

public class İnsertionAndReverseTime {

    public static void main(String[] args) {


        int data[]=İnsertionSortAndReverseİnsertionSort.FillBox(100000);
        Lab2.İnsertionAndReverseTime.insertion(data);
        reverseinser(data);








    }

    public  static void insertion(int data[]){
        long time=System.currentTimeMillis();
        İnsertionSortAndReverseİnsertionSort.insertion(data);
        long time2=System.currentTimeMillis();
        long fark=time2-time;
        System.out.println(fark);
    }

    public static  void reverseinser(int data[]){
        long time3=System.currentTimeMillis();
        İnsertionSortAndReverseİnsertionSort.insertion_sort_reverse(data);
        long time4=System.currentTimeMillis();
        long farkİnseriton=time4-time3;

        System.out.println(farkİnseriton);

    }
}
