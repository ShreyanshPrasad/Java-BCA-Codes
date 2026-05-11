class Student {
    String name;
    int age;

    //Student() {}

    void greet() {
        System.out.println("Hi, I am " + name);
    }
}

// Step 2 — Create an object (instance)
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();   // object created

        // Step 3 — Assign values to fields
        s1.name = "Alice";
        s1.age = 20;

        // Step 4 — Call methods
        s1.greet();  // Output: Hi, I am Alice
    }
}