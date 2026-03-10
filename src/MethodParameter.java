public class MethodParameter {
    public static void main(String[] args) {

        sayHello("Alvin", "Keren");
        sayHello("Dzaky", "Keren");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("hello " + firstName + " " + lastName);
    }
}
