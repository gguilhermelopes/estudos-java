package lambdas;

import lambdas.MyEventConsumer;

public class Anonymous {
    public static void main(String[] args) {
        MyEventConsumer myEventConsumer = new MyEventConsumer() {
            @Override
            public void consumer(Object value) {
                System.out.println(value);
            }
        };
        myEventConsumer.consumer("Anônima");

        MyEventConsumer myEventConsumerLambda = (Object value) -> System.out.println(value);
        myEventConsumerLambda.consumer("lambda");
    }
}
