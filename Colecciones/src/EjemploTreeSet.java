import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {

    public static void main(String[] args){
        Set<String> ts = new TreeSet<>((a, b) -> a.compareTo(b));
                                     //Comparator.reverseOrder()


        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");
        ts.add("seis");

        //orden alfabético
        System.out.println("ts: " + ts);

        Set<Integer> num = new TreeSet<>(Comparator.reverseOrder());

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        System.out.println(num);

    }
}
