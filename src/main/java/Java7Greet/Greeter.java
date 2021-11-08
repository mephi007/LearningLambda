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

        //JAVA 8
        // As Greeting Interface is having one abstract method and whose anonymous implementation is done by lambda expression.
        // NO NEED to create different classes to be performing some polymorphism action.
        Greeting myLambdaHelloWorldFunction = () -> System.out.println("Hello World");
        Greeting myLambdaNamasteWorldFunction = () -> System.out.println("Namaste World");
        myLambdaHelloWorldFunction.performGreeting();
        myLambdaNamasteWorldFunction.performGreeting();
    }
}
