import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();

        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println(hs);

        boolean b = hs.add("tres");
        //no se aceptan repetidos
        System.out.println("permites meterlo? " + b);

        //no puedes ordenar un Set, solo un ArrayList
        //Collections.sort(hs);

        //para poder ordenarlo tendría que convertir el Set en un ArrayList
        List<String> list = new ArrayList<>(hs);
        Collections.sort(list);
        System.out.println("Set ordenado una vez convertido a ArrayList");
        System.out.println(list);


    }
}
