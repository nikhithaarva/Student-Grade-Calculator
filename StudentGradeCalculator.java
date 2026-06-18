import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfSubjects;
        int mark;
        int totalMarks = 0;
        double average;
        char grade;

        System.out.print("Enter number of subjects: ");
        numberOfSubjects = sc.nextInt();

        for (int i = 1; i <= numberOfSubjects; i++) {

            System.out.print("Enter marks for subject " + i + ": ");
            mark = sc.nextInt();

            while (mark < 0 || mark > 100) {
                System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                System.out.print("Enter marks again for subject " + i + ": ");
                mark = sc.nextInt();
            }

            totalMarks += mark;
        }

        average = (double) totalMarks / numberOfSubjects;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Total Marks = " + totalMarks);
        System.out.printf("Average Percentage = %.2f%%\n", average);
        System.out.println("Grade = " + grade);

        sc.close();
    }
}