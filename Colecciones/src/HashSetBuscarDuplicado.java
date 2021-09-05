import java.util.HashSet;
import java.util.Set;

public class HashSetBuscarDuplicado {


    public static void main(String[] args){
        String[] peces = {"Mero", "Atún", "Corvina", "Róbalo", "Atún"};

        Set<String> unicos = new HashSet<>();

        for(String pez: peces){
            //si es false es que no lo ha podido añadir
            //porque ya se encontraba dentro
            if(!unicos.add(pez)){
                System.out.println("ya esta añadido: " + pez);
            }

        }

    }

}
