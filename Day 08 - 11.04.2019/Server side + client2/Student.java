package Program;

import java.io.Serializable;

public class Student extends Person implements Serializable {

    private String studentNumber;

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }


    public Student(String name, String lastName, String id, String email, int age, String studentNumber) {
        super(name, lastName, id, email, age);
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber: " + studentNumber + "," +
                " name: " + getName() + "," +
                " lastName: " + getLastName() + "," +
                " id: " + getId() + "," +
                " email: " + getEmail() + "," +
                " age=" + getAge() + "}";
    }
}

