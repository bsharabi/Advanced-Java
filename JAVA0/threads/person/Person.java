package threads.person;

public class Person {
    private String name;

    private String id;
    private int age;

    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: "+name+" Age: "+age+" Id: "+id;
    }

    public Person() {

    }
}
