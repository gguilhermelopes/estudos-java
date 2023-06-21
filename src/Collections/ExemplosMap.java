package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExemplosMap {
    public void HashMapExemplo(){
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "Guilherme");
        lista.put(2, "Buken");
        lista.put(3, "Fubos");
        lista.put(4, "Alvinho");

        lista.forEach((key, value) -> System.out.println(key + ": " + value));

        Set<Map.Entry<Integer, String>> entry = lista.entrySet();
        for(Map.Entry<Integer, String> i : entry){
            System.out.println(i.getKey());
            System.out.println(i.getValue());
        }

        entry.forEach(i -> {
            System.out.println(i.getValue());
        });



    }
}
