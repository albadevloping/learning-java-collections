import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {

    public static void main(String[] args){
        Map<String, Object> persona = new HashMap<>();

        persona.put("Nombre", "Alba");
        persona.put("Apellido", "Megías");
        persona.put("Email", "alba@outlook.com");
        persona.put("Edad", "25");
        persona.put(null, "1234");


        Map<String, String> dirección = new HashMap<>();
        dirección.put("País", "España");
        dirección.put("Comunidad Autónoma", "Andalucía");
        dirección.put("Provincia", "Granada");


        persona.put("Dirección", dirección);



        System.out.println(persona);

        String nombre = (String)persona.get("Nombre");
        String apellido = (String)persona.get("Apellido");

        System.out.println("El nombre de la persona es: " + nombre);
        System.out.println("El apellido de la persona es: " + apellido);

        //se puede borrar a través de la llave o a través del valor
        String claveNula = (String)persona.remove(null);
        System.out.println("Persona sin clave nula: " + claveNula);
        System.out.println("Persona = " + persona);


        //imprimir las llaves
        Set<String> llaves = persona.keySet();
        for(String k: llaves){
            System.out.println(k);
        }


        //Imprimir los valores
        System.out.println();
        Collection<Object> valores = persona.values();
        for(Object v: valores){
            System.out.println(v);
        }


        // .entrySet -> devuelve un conjunto de elementos de tipo entrySet
        for(Map.Entry<String, Object> par: persona.entrySet()){
            System.out.println(par.getKey() + " =>" + par.getValue() );
        }

        //imprimir la llave y el valor
        System.out.println("llave y valor");
        for(String llave: persona.keySet()){
            Object valor = persona.get(llave);
            System.out.println(llave + " => " + valor);
        }

        //imprimir la llave y el valor
        System.out.println("===== Java 8 =====");
        System.out.println("llave y valor");
        persona.forEach((llave, valor) -> {
            System.out.println(llave + " => " + valor);
        });


        //reemplazar un valor
        System.out.println("================");
        persona.replace("Nombre", "------");
        System.out.print(persona);


        //Obtener la dirección de la persona
        //persona.get => le das la clave y te devuelve el valor
        Map<String, String> direcciónPersona = (Map<String, String>) persona.get("Dirección");


        //con esto si no tiene un valor o no existe la llave, la puedes crear sobre la marcha
        String barrio = direcciónPersona.getOrDefault("Barrio", "Heras Altas");
        System.out.println("\nEl barrio de esta persona es: " + barrio);


    }

}
