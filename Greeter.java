public class Greeter {
    public static void main(String[] args) {

        String DEFAULT_NAME = "people of Earth";
        
        // Condition ? value when condition is true : when value is false
        String name = args.length > 0 ? args[0] : DEFAULT_NAME;

        System.out.printf("Greetings %s!\n", name);
        System.out.println("Have a nice day.")

    }
}