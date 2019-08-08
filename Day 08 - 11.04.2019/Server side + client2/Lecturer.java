package Program;

import java.io.Serializable;

public class Lecturer extends Person implements Serializable {

    private int salery;
    private String lecturerNumber;


    public int getSalery() { return salery; }

    public void setSalery(int salery) { this.salery = salery; }

    public String getLecturerNumber() { return lecturerNumber; }

    public void setLecturerNumber(String lecturerNumber) { this.lecturerNumber = lecturerNumber; }

    public Lecturer(String name, String lastName, String id, String email, int age, int salery, String lecturerNumber) {
        super(name, lastName, id, email, age);
        this.salery = salery;
        this.lecturerNumber = lecturerNumber;
    }

    @Override
    public String toString() {
        return "Lecturer{"+
                "salery: " + salery +","+
                " name: " + getName() +","+
                " lastName: " + getLastName() +","+
                " id: " + getId() +","+
                " email: " + getEmail() +","+
                " age: " + getAge()+"}";
//
//        return "Lecturer{\n" +
//                "salery: " + salery + ",\n"+
//                "name: " + getName() + ",\n" +
//                "lastName: " + getLastName() + ",\n" +
//                "id: " + getId() + ",\n" +
//                "email: " + getEmail() + ",\n" +
//                "age=" + getAge() + "}\n";
    }
}
