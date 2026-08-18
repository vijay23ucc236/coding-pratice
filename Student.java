import java.util.Scanner;

class Student 
{
   String name;
    int rollNo;

    void addStudent(String name, int rollNo) 
	{
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("Student details saved");
    }

    void updateName(String name) 
	{
        this.name = name;
    }

    void displayStudent() 
	{
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}


    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        while (true) 
		{
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice)
			{
                case 1:
                    String name = sc.nextLine();
                    int rollNo = sc.nextInt();
                    student.addStudent(name, rollNo);
                    break;

                case 2:
                    String newName = sc.nextLine();
                    student.updateName(newName);
                    break;

                case 3:
                    student.displayStudent();
                    break;

                case 4:
                    System.out.println("Exited");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
