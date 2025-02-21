package HashMap.SistemaMatricula;

import HashMap.AssignacioDorsals.Player;

import java.util.Scanner;

public class Test {
    private CourseManager manager;

    public static void main(String[] args) {
        CourseManager manager = new CourseManager();
        Scanner input = new Scanner(System.in);
        int opcio;
        boolean execucio = true;
        while (execucio) {
            System.out.println("\nMenú:");
            System.out.println("1. Enroll student");
            System.out.println("2. Unenroll student");
            System.out.println("3. Find student by ID");
            System.out.println("4. List All Students");
            System.out.println("0. Sortir");
            System.out.print("Escull una opció: ");
            opcio = input.nextInt();
            input.nextLine();

            switch (opcio) {
                case 1:
                    System.out.print("Introduce the ID: ");
                    String id = input.nextLine();
                    System.out.print("Introduce the name: ");
                    String name = input.nextLine();
                    System.out.print("Introduce the age: ");
                    int age = input.nextInt();
                    input.nextLine();
                    manager.enrollStudent(new Student(id, name, age));
                    break;

                case 2:
                    System.out.print("Introduce the ID: ");
                    id = input.nextLine();
                    manager.unenrollStudent(id);
                    System.out.println("Student unenrolled succesfully.");
                    break;

                case 3:
                    System.out.print("Introduce the ID: ");
                    id = input.nextLine();
                    System.out.println(manager.findStudentById(id));
                    break;

                case 4:
                    manager.listAllStudents();
                    break;

                case 0:
                    System.out.println("Exiting the program...");
                    execucio = false;
                    break;
                default:
                    System.out.println("Unvalid option, please try again.");
            }
        }
    }

}
