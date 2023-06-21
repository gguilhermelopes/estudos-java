package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExercicioCollections {
    public void exercicio(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva nomes separados por ',':");
        String[] responseArr = scanner.next().split(",");

        List<String> listaNomes = new ArrayList<>();

        Collections.addAll(listaNomes, responseArr);

        Collections.sort(listaNomes);

        for(String name : listaNomes){
            System.out.println(name);
        }

    }
}
