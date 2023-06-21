package Collections;

import java.util.Scanner;


public class BubbleSort {
    public void ExemploBubbleSort (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os valores inteiros separados por ', '");

        String response = scanner.next();
        String[] vetRes = response.split(",");
        int[] vet = convert(vetRes);


        int aux;

        for (int i = 0; i < vet.length; i++){
            for(int j = 0; j < vet.length - 1; j++ ){
                if(vet[j] > vet[j+1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
        for (int j : vet) {
            System.out.println(j);
        }

    }

    private static int[] convert(String[] vetStr){
        int[] numbers = new int[vetStr.length];
        for(int i = 0; i < vetStr.length; i++){
            numbers[i] = Integer.parseInt(vetStr[i]);
        }
        return numbers;
    }
}
