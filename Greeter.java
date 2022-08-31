public class Greeter {
    public static void main(String[] args) {

        GreetMachine gm = new GreetMachine();
        System.out.println(gm);

        // Condition ? value when condition is true : when value is false
        String name = args.length > 0 ? args[0] : "Earthlings";

        System.out.printf("Greetings %s!\n", name);

    }
}