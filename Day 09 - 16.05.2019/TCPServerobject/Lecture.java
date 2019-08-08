import java.io.Serializable;


public class Lecture extends Person implements Serializable{


	private double salary;

	public Lecture(String name, String id, double salary) {
		super(name, id);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
