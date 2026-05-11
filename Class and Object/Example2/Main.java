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
        Student s2 = new Student("Bob", 22);
	    Student s3 =  new Student();

        s3.name = "Siri";
        s3.age = 21;

        s1.display();  // Name: Alice | Age: 20
        s2.display();  // Name: Bob | Age: 22
        s3.display();
    }
}
