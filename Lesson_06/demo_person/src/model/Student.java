package model;

import java.util.Scanner;

public class Student {
    public int id;
    public String name;
    public float theoryPoint;
    public float practicalPoint;
    public static String school = "Techmaster";

    public Student() {
    }

    public Student(int id, String name, float theoryPoint, float practicalPoint) {
        this.id = id;
        this.name = name;
        this.theoryPoint = theoryPoint;
        this.practicalPoint = practicalPoint;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết: ");
        this.theoryPoint = sc.nextFloat();
        System.out.println("Nhập điểm thực hành: ");
        this.practicalPoint = sc.nextFloat();
    }

    public float avg(){
        return (this.theoryPoint + this.practicalPoint)/2;
    }

    public void output(){
        System.out.println(this.id + " - " + this.name + " - " + this.theoryPoint
            + " - " + this.practicalPoint + " - " + avg());
    }

    @Override
    public String toString() {
        return this.id + " - " + this.name + " - " + this.theoryPoint
                + " - " + this.practicalPoint + " - " + avg();
    }
}
