public class Greeter {
    public static void main(String[] args) {
        // Condition ? value when condition is true : when value is false
        String name = args.length > 0 ? args[0] : "Earthlings";

        System.out.printf("Greetings %s!\n", name);

    }
}