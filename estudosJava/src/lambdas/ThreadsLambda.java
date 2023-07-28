package lambdas;

public class ThreadsLambda {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando comum");
            }
        };
        new Thread(runnable).start();

        Runnable runnableLambda = () ->  System.out.println("Lambda");
        new Thread(runnableLambda).start();

    }
}
