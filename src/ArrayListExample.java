import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public void exemploListaSimples(){
        List<String> list = new ArrayList<>();
        list.add("Guilherme");
        list.add("Buken");
        list.add("Fubá");
        Collections.sort(list);
        System.out.println(list);

        List<Integer> listInt = new ArrayList<Integer>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        Collections.sort(listInt);
        Collections.reverse(listInt);
        System.out.println(listInt);

        List<Aluno> alunos = new ArrayList<Aluno>();

        Aluno a = new Aluno("Guilherme", "Java", 8);
        Aluno b = new Aluno("Buken", "JavaScript", 10);

        alunos.add(a);
        alunos.add(b);

        System.out.println(alunos);


    }
}
