package codTech.student;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private Map<String, Integer> subjectMarks;

    //creating constructors
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjectMarks = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public Map<String, Integer> getSubjectMarks() {
        return subjectMarks;
    }

    public void addMark(String subject, int mark) {
        subjectMarks.put(subject, mark);
    }

    public void updateMark(String subject, int mark) {
        if (subjectMarks.containsKey(subject)) {
            subjectMarks.put(subject, mark);
        } else {
            System.out.println("Subject not found!");
        }
    }

    public void deleteMark(String subject) {
        if (subjectMarks.containsKey(subject)) {
            subjectMarks.remove(subject);
        } else {
            System.out.println("Subject not found!");
        }
    }

    public double calculatePercentage() {
        int totalMarks = 0;
        for (int mark : subjectMarks.values()) {
            totalMarks += mark;
        }
        return (double) totalMarks / subjectMarks.size();
    }

    public String calculateGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70) {
            return "C";
        } else if (percentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    //displaying student detail
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Subject Marks:");
        for (Map.Entry<String, Integer> entry : subjectMarks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Overall Percentage: " + calculatePercentage());
        System.out.println("Grade Obtained: " + calculateGrade());
    }
}
