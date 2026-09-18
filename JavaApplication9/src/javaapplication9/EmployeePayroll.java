
package javaapplication9;

import java.util.*;

class Employee {
    int id;
    String name, department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    double netSalary() {
        double hra = salary * 0.20;
        double da = salary * 0.10;
        double pf = salary * 0.05;
        return salary + hra + da - pf;
    }

    void display() {
        System.out.println(id + " | " + name + " | " +
                department + " | " + salary +
                " | Net: " + netSalary());
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1.Add  2.View  3.Search  4.Update  5.Net Salary  6.Delete  7.Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Department: ");
                String dept = sc.nextLine();

                System.out.print("Basic Salary: ");
                double salary = sc.nextDouble();

                list.add(new Employee(id, name, dept, salary));
                System.out.println("Employee Added!");

            } else if (ch == 2) {
                for (Employee e : list)
                    e.display();

            } else if (ch == 3) {
                System.out.print("Employee ID: ");
                int id = sc.nextInt();

                for (Employee e : list) {
                    if (e.id == id)
                        e.display();
                }

            } else if (ch == 4) {
                System.out.print("Employee ID: ");
                int id = sc.nextInt();

                for (Employee e : list) {
                    if (e.id == id) {
                        System.out.print("New Salary: ");
                        e.salary = sc.nextDouble();
                        System.out.println("Updated!");
                    }
                }

            } else if (ch == 5) {
                System.out.print("Employee ID: ");
                int id = sc.nextInt();

                for (Employee e : list) {
                    if (e.id == id)
                        System.out.println("Net Salary = " + e.netSalary());
                }

            } else if (ch == 6) {
                System.out.print("Employee ID: ");
                int id = sc.nextInt();

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).id == id) {
                        list.remove(i);
                        System.out.println("Deleted!");
                        break;
                    }
                }

            } else if (ch == 7) {
                break;
            }
        }
    }
}