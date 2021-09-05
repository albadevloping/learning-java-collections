import java.util.*;

public class ListComparableComparator {
    public static void main(String[] args){
        //ordena el TreeSet por lo que le indiques en la expresión lambda
        List<Alumno> ts = new ArrayList<>();

        ts.add(new Alumno("Julia", 5));
        ts.add(new Alumno("Alba", 9));
        ts.add(new Alumno("Teresa María", 8));
        ts.add(new Alumno("Alba", 3));
        ts.add(new Alumno("Alba", 3));
        //System.out.println(ts);


        //ordenar
        Collections.sort(ts, (a, b) -> a.getNota().compareTo(b.getNota()) );
        System.out.println(ts);


        //ordenar
        //ts.sort(Comparator.comparing((Alumno a) -> a.getNota()).reversed());


         ListIterator<Alumno> li = ts.listIterator();
        //while(li.hasNext()){
        //      System.out.println(li.next());
        //      //Alumno a = li.next();
        //}


        //System.out.println("iterando con lambda");
        //ts.forEach(alu -> System.out.println(alu));
        //más resumido
        //ts.forEach(System.out::println);

    }
}
