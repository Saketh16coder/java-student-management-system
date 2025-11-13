import java.util.Scanner;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100];
        int count = 0;

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Marks: ");
                double marks = sc.nextDouble();

                students[count++] = new Student(id, name, marks);
                System.out.println("Student added successfully.");

            } else if (choice == 2) {
                if (count == 0) {
                    System.out.println("No students found.");
                } else {
                    for (int i = 0; i < count; i++) {
                        System.out.println(students[i].id + " " +
                                           students[i].name + " " +
                                           students[i].marks);
                    }
                }

            } else if (choice == 3) {
                System.out.print("Enter ID to search: ");
                int id = sc.nextInt();
                boolean found = false;

                for (int i = 0; i < count; i++) {
                    if (students[i].id == id) {
                        System.out.println("Student Found: " +
                                           students[i].name + " - " +
                                           students[i].marks);
                        found = true;
                        break;
                    }
                }

                if (!found) System.out.println("Student not found.");

            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
