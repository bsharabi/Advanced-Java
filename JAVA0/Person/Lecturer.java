package Person;

public class Lecturer extends Person {
    private double salary;

    public Lecturer(String id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
