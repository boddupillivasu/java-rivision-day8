package com.oops.java;

public class Student {

    // instance variables

    String name;
    int age;
    char grade;
    String email;
    double marks;

    //constructor
    public Student(String name, int age, char grade, String email, double marks) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.email = email;
        this.marks = marks;
    }

    //method
    public void displayStudentDetails() {
        System.out.println("student name:" + name);
        System.out.println("student age:" + age);
        System.out.println("student grade:" + grade);
        System.out.println("student email:" + email);
        System.out.println("student marks:" + marks);
    }

    public static void main(String[] args) {

        //creating three instances

        Student student;
        student = new Student("challa venkata kalyan", 21, 'a', "challavenkatakalyan@123", 78.3d);

        Student student1;
        student1 = new Student("bharath", 21, 'b', "chandubharath@132", 79);

        Student student2;
        student2 = new Student("manohar", 23, 'c', "manoharnaidu@143", 98);

        student.displayStudentDetails();
        student1.displayStudentDetails();
        student2.displayStudentDetails();
    }
}
