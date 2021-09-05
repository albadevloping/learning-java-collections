import java.util.HashSet;
import java.util.Set;

public class HashSetBuscarDuplicado2 {


    public static void main(String[] args){
        String[] peces = {"Mero", "Lenguado", "Lenguado", "Atún", "Corvina", "Robalo", "Atún"};

        Set<String> unicos = new HashSet<>();

        Set<String> duplicados = new HashSet<>();

        for(String pez: peces){
            //si es false es que no lo ha podido añadir
            //porque ya se encontraba dentro
            if(!unicos.add(pez)){
                //guardamos en duplicados los peces que se repiten
                duplicados.add(pez);
            }

        }
        System.out.println("unicos antes: " + unicos);
        //en duplicado hemos guardado los duplicados
        //borramos los duplicados de unicos a través de duplicados
        unicos.removeAll(duplicados);
        System.out.println("unicos después" + unicos);
        System.out.println("duplicados: " +duplicados);

    }

}
