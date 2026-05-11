class Student {
    String name;
    int age;

    Student() {} //Default

    Student(String n, int a) { //Parametrised
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + " | Age: " + age);
    }

    
}

public class Main {
    public static void main(String[] args) {
        Student s1;
        Student s2 = null;
        s1.display();
        s2.display();
    }
}
