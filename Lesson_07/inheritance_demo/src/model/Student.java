package model;

import java.time.LocalDate;

public class Student extends  Person{
    private String classroom;
    private float point;

    public Student() {
    }

    public Student(int id, String name, LocalDate birthDay, Gender gender, String address, String classroom, float point) {
        super(id, name, birthDay, gender, address);
        this.classroom = classroom;
        this.point = point;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }
}
