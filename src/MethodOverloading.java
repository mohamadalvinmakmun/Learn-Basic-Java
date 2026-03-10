public class MethodOverloading {
    static void main() {

        sayHello();
        sayHello("Alvin");
        sayHello("Alvin", "keren");
    }

    static void sayHello() {
        System.out.println("Hello ");
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
