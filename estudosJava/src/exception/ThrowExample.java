package exception;

public class ThrowExample {
    public static void withdraw(double value) throws WithdrawLimitException{
        if(value > 400){
            WithdrawLimitException error =
                    new WithdrawLimitException(
                            "Valor solicitado é maior que o limite diário definido."
                    );
            throw error;
        } else {
            System.out.println("Valor retirado da conta: R$ " + value);
        }
    }
}
