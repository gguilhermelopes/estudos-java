package exception;

public class Main {
    public static void main(String[] args){
        exception();

    }

    private static void exception() {
        try {
            ThrowExample.withdraw(300);
        } catch (WithdrawLimitException error){
            System.out.println("Erro: " + error.getMessage());
        }
    }
}
