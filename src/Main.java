import classesAbstratas.Assalariado;
import classesAbstratas.Comissionado;
import classesAbstratas.Empregado;
import collections.*;
import interfaces.CanetaEsferografica;
import interfaces.ICaneta;

public class Main {
    public static void main(String[] args) {
    ArrayListExample arraylist = new ArrayListExample();
    QueueAndDeque queueAndDeque = new QueueAndDeque();
    SetCollection setCollection = new SetCollection();
    ArrayTestes arrayTestes = new ArrayTestes();
    BubbleSort bubbleSort = new BubbleSort();
    ExemplosMap exemplosMap = new ExemplosMap();
    ExercicioCollections exercicioCollections = new ExercicioCollections();
    ICaneta caneta = new CanetaEsferografica();
    Assalariado assalariado = new Assalariado();

    assalariado.setNome("Guilherme");
    assalariado.setSalario(3200d);

    imprimir(assalariado);

    Comissionado comissionado = new Comissionado();
    comissionado.setNome("Fubazinho");
    comissionado.setTotalVenda(1200d);
    comissionado.setTotalComissao(600d);

    imprimir(comissionado);

    }
    public static void imprimir(Empregado empregado){
        if(empregado instanceof Comissionado){
            Comissionado comissionado = (Comissionado) empregado;
            System.out.println(comissionado.getTotalComissao());
        }
        System.out.println(empregado.getNome() + " tem salario de: " + empregado.vencimento());
    }
}