package Person;

import java.io.Serializable;

public abstract class Person implements Serializable {
    private String id;
    private String name;
    private int age;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(((Person)obj).id.equals(id));
    }

    @Override
    public String toString() {
        return "Name is: "+name+" Id is: "+id;
    }
}
