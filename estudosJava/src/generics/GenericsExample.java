package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public List createList(){
        List<String> list = new ArrayList();
        list.add("Teste");
        list.add("15");

        return list;
    }

    public void printList(List<String> list){
        for(String item : list){
            System.out.println(item);
        }
    }

    public <T> void printGenericList(List<T> list){
        for(T item : list){
            System.out.println(item);
        }
    }

}
