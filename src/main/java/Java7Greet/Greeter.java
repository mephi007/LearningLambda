package Java7Greet;

public class Greeter {

    //even though for different actions, before Java 8, we have to code through objects.
    // Till Java 8, we can not think of piece of code as just Verb or Action.
    public void greet(Greeting greetings){
        greetings.performGreeting();
    }

    public static void main(String[] args) {
        Greeting helloWorld = new HelloWorld();
        Greeting namasteWorld = new NamasteWorld();
        Greeter greeter = new Greeter();
        greeter.greet(helloWorld);
        greeter.greet(namasteWorld);
    }
}
