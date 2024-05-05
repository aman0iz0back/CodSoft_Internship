import java.util.Scanner;


public class StudentGradeCalculator {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentGradeCalculator studentGradeCalculator = new StudentGradeCalculator();
        studentGradeCalculator.display();
    }

    public int getTotalMarks() {
        int[] marks = new int[5];
        int totalMarks = 0;
        System.out.println("Enter the marks of 5 subjects out of 100");
        for (int i = 0; i < 5; i++) {
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }
        return totalMarks;
    }

    public double getAveragePercentage(int totalMarks) {
        double averagePercentage;
        averagePercentage = ((double) totalMarks / 500) * 100;
        return averagePercentage;
    }

    public char GetGrade(Double averagePercentage) {
        if (averagePercentage <= 100 && averagePercentage >= 90) {
            return 'O';
        } else if (averagePercentage <= 89.9 && averagePercentage >= 80) {
            return 'A';
        } else if (averagePercentage <= 79.9 && averagePercentage >= 70) {
            return 'B';
        } else if (averagePercentage <= 69.9 && averagePercentage >= 60) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public void display() {
        int totalMarks = getTotalMarks();
        double averagePercentage = getAveragePercentage(totalMarks);
        char finalGrade = GetGrade(averagePercentage);
        System.out.println("The total marks is " + totalMarks);
        System.out.println("The average percentage is " + averagePercentage);
        System.out.println("The grade of the student is " + finalGrade);
    }
}
