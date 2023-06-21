package Collections;

public class ArrayTestes {

    public void testesArray(){
        int [] arrayNumbers = new int[20];
        for (int i = 0; i<=arrayNumbers.length - 1; i++){
            arrayNumbers[i] = i * 2;
        }
        System.out.println(arrayNumbers);
    }



}
