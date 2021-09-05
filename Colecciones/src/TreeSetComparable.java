import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparable {
    public static void main(String[] args){
        //ordena el TreeSet por lo que le indiques en la expresión lambda
        Set<Alumno> ts = new TreeSet<>((a, b) -> b.getNota().compareTo(a.getNota()));

        ts.add(new Alumno("Julia", 5));
        ts.add(new Alumno("Alba", 9));
        ts.add(new Alumno("Teresa María", 8));
        ts.add(new Alumno("Alba", 10));
        ts.add(new Alumno("Alba", 3));
        System.out.println(ts);

        System.out.println("iterando con foreach");
        for(Alumno alu: ts){
            System.out.println(alu);
        }

        System.out.println("iterando con iterator");
        Iterator<Alumno> it = ts.iterator();

        while(it.hasNext()){
            Alumno alu = it.next();
            System.out.println(alu);
        }

        System.out.println("iterando con lambda");
        //ts.forEach(alu -> System.out.println(alu));

        //más resumido
        ts.forEach(System.out::println);
    }
}
