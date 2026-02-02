package TurkcellStaj;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// list ve set farkı
public class ListAndSet {

    static void main() {
        List<String> mystrin=new ArrayList<String>();
        mystrin.add("1");
        mystrin.add("3");
        mystrin.add("2");

        mystrin.add("4");
        System.out.println(mystrin);


        Set<String> mySet=new HashSet<String>();
        mySet.add("1");
        mySet.add("2");
        mySet.add("2");
        mySet.add("4");
        mySet.add("3");

        mySet.add("125");

        System.out.println(mySet);

    }




}
