import java.io.Serializable;


public class Student extends Person implements Serializable{

	
	private int age;

	public Student(String name, String id, int age) {
		super(name, id);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
