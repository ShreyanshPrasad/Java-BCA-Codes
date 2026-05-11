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
        Student s1 = new Student("Alice", 20);
        s1.display(); //Name: Alice | Age: 20

        //Annonymous Obj
        new Student("RVSCET", 22).display(); //Name: RVSCET | Age: 22
    }
}
