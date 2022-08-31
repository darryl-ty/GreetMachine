public class GreetMachine{
    private String name;

    public GreetMachine() {
        name = "Earthlings";

    }

    public GreetMachine(String name_in) {
        name = name_in;
    }

    public String toString() {
        return "Greetings " + name + "!";
    }

    public void setName(String name_in) {

    }
}