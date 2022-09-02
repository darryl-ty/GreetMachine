public class GreetMachine{

    private final String DEFAULT_NAME = "People of Earth";

    private String name;

    public GreetMachine() {
        name = DEFAULT_NAME;

    }

    public GreetMachine(String name_in) {
        name = name_in;
    }

    public String toString() {
        return "Greetings " + name + "!";
    }

    public void setName(String name_in) {
        name = name_in;
    }
}