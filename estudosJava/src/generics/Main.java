package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
       ClassWithGenerics<String> classWithGenerics = new ClassWithGenerics<>("Guilherme");
       System.out.println(classWithGenerics.getData());

    }
}
