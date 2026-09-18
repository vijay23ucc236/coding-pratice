package javaapplication9;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    int age;
    String course;
    double marks;

    Student(int rollNumber, String name, int age, String course, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Course      : " + course);
        System.out.println("Marks       : " + marks);
        System.out.println("-------------------------");
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter Roll Number: ");
                int roll = sc.nextInt();

                boolean exists = false;

                for (Student s : students) {
                    if (s.rollNumber == roll) {
                        exists = true;
                        break;
                    }
                }

                if (exists) {
                    System.out.println("Roll Number already exists!");
                } else {

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    students.add(new Student(roll, name, age, course, marks));

                    System.out.println("Student added successfully!");
                }

            } else if (choice == 2) {

                if (students.isEmpty()) {
                    System.out.println("No students found.");
                } else {

                    for (Student s : students) {
                        s.display();
                    }
                }

            } else if (choice == 3) {

                System.out.print("Enter Roll Number: ");
                int roll = sc.nextInt();

                boolean found = false;

                for (Student s : students) {

                    if (s.rollNumber == roll) {
                        s.display();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found.");
                }

            } else if (choice == 4) {

                System.out.print("Enter Roll Number: ");
                int roll = sc.nextInt();

                boolean found = false;

                for (Student s : students) {

                    if (s.rollNumber == roll) {

                        System.out.print("Enter New Marks: ");
                        s.marks = sc.nextDouble();

                        System.out.println("Marks updated successfully!");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found.");
                }

            } else if (choice == 5) {

                System.out.print("Enter Roll Number: ");
                int roll = sc.nextInt();

                boolean found = false;

                for (int i = 0; i < students.size(); i++) {

                    if (students.get(i).rollNumber == roll) {

                        students.remove(i);

                        System.out.println("Student deleted successfully!");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found.");
                }

            } else if (choice == 6) {

                System.out.println("Program ended.");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}

   