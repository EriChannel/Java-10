package model;

public class Dog {
    public String breed;
    public String size;
    public int age;
    public String color;

    public Dog() {
    }

    public Dog(String breed, String size, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public Dog(String breed, String size, int age) {
        this.breed = breed;
        this.size = size;
        this.age = age;
    }


}
