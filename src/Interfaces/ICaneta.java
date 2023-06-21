package Interfaces;

public interface ICaneta {

    void escrever (String texto);

    String getCor();

    default void escreverFixo(){
        System.out.println("Método fixo à interface");
    }
}
