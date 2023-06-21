import Collections.*;
import Interfaces.CanetaEsferografica;
import Interfaces.ICaneta;

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

    caneta.escrever("Teste");
    caneta.escreverFixo();



    }
}