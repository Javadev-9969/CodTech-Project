package codTech.student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExecutionLayerOfStudentGradingSystem {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Map<Integer, Student> students = new HashMap<>();

            while (true) {
                System.out.println("1. Add Student");
                System.out.println("2. Update Student");
                System.out.println("3. Delete Student");
                System.out.println("4. Display Students Details");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter student name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter roll number: ");
                        int rollNumber = scanner.nextInt();
                        Student student = new Student(name, rollNumber);
                        students.put(rollNumber, student);
                        System.out.print("Enter the number of subjects for this student: ");
                        int numSubjects = scanner.nextInt();
                        scanner.nextLine();
                        for (int i = 0; i < numSubjects; i++) {
                            System.out.print("Enter subject name: ");
                            String subject = scanner.nextLine();
                            System.out.print("Enter marks for subject " + subject + ": ");
                            int mark = scanner.nextInt();
                            scanner.nextLine();
                            student.addMark(subject, mark);
                        }
                        break;
                    case 2:
                        System.out.print("Enter roll number of student to update: ");
                        int rollToUpdate = scanner.nextInt();
                        scanner.nextLine();
                        if (students.containsKey(rollToUpdate)) {
                            Student studentToUpdate = students.get(rollToUpdate);
                            System.out.print("Enter subject to update: ");
                            String subjectToUpdate = scanner.nextLine();
                            if (studentToUpdate.getSubjectMarks().containsKey(subjectToUpdate)) {
                                System.out.print("Enter new mark: ");
                                int newMark = scanner.nextInt();
                                studentToUpdate.updateMark(subjectToUpdate, newMark);
                            } else {
                                System.out.println("Subject not found for this student!");
                            }
                        } else {
                            System.out.println("Student not found!");
                        }
                        break;
                    case 3:
                        System.out.print("Enter roll number of student to delete: ");
                        int rollToDelete = scanner.nextInt();
                        if (students.containsKey(rollToDelete)) {
                            students.remove(rollToDelete);
                        } else {
                            System.out.println("Student not found!");
                        }
                        break;
                    case 4:
                        System.out.print("Enter roll number of student to display information: ");
                        int rollToDisplay = scanner.nextInt();
                        if (students.containsKey(rollToDisplay)) {
                            Student studentToDisplay = students.get(rollToDisplay);
                            studentToDisplay.display();
                        } else {
                            System.out.println("Student not found!");
                        }
                        break;
                    case 5:
                        System.out.println("Exiting program...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        }
    }

