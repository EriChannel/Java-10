package model;

import java.time.LocalDate;

public class Person {
    private int id;
    private String name;
    private LocalDate birthDay;
    private Gender gender;
    private String address;

    public Person(int id, String name, LocalDate birthDay, Gender gender, String address) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.address = address;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

