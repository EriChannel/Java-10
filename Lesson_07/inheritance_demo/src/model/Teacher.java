package model;

import java.time.LocalDate;

public class Teacher extends Person{
    private String subject;
    private long salary;

    public Teacher() {
    }

    public Teacher(int id, String name, LocalDate birthDay, Gender gender, String address, String subject, long salary) {
        super(id, name, birthDay, gender, address);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
