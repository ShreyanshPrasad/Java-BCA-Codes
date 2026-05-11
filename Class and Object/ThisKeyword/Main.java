class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;      // this.name = instance variable
        this.salary = salary;  // name (right side) = constructor parameter
    }

    void display() {
        System.out.println(this.name + " earns " + this.salary);
    }
}

public class Main {
    public static void main(String...args){
        Employee e1 = new Employee("RVSCET", 60000);
        e1.display();
    }
}
