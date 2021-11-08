public class RunnableLambdaExample {

    public static void main(String[] args) {

        //before Java 8
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1");
            }
        };
        new Thread(t1).start();

        //Java 8
        Runnable t2 = ()-> {
            System.out.println("Thread 2");
        };
        new Thread(t2).start();

        Thread t3 = new Thread(() -> System.out.println("thread 3"));
        t3.start();
    }
}
