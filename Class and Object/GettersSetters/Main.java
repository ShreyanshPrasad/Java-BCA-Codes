class Employee {
    private String name;    // hidden from outside
    private double salary;

    // Getter — read the value
    public String getName() {
        return name;
    }

    // Setter — set the value with control
    public void setName(String n) {
        if (n != null && !n.isEmpty()) {
            name = n;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double s) {
        if (s > 0) {         // validation before setting
            salary = s;
        }
    }
}

public class Main{
    public static void main(String...args){
        Employee e1 = new Employee();
        e1.setName("RVSCET");
        e1.setSalary(60000);

        System.out.println("Name: " + e1.getName() + " | Salary: " + e1.getSalary());
    }
}
