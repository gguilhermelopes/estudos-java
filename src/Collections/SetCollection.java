package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {

    public void hashSetTreeSetLinkedHashSet(){
        // Não permite repetição de valores
        Set<String> lista = new HashSet<>();
        lista.add("Guilherme");
        lista.add("Bukenzitos");
        lista.add("Fubeicos");

        System.out.println(lista);

        Aluno a = new Aluno("Gui", "Java", 10);
        Aluno b = new Aluno("Buken", "Java", 8);
        Aluno c = new Aluno("Fubos", "Java", 9);
        Aluno d = new Aluno("Gui", "Java", 10);


        Set<Aluno> alunos = new HashSet<>();

        alunos.add(a);
        alunos.add(b);
        alunos.add(c);
        alunos.add(d);

        System.out.println(alunos);
    }
}
