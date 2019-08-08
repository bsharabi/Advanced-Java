package Program;

import java.io.Serializable;

public abstract class Person implements Serializable {

    private String name;
    private String lastName;
    private String id;
    private String email;
    private int age;


    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }


    public Person(String name, String lastName, String id, String email, int age) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
