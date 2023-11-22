import java.util.Scanner;

/**
 * arrayAverageScore13
 */
public class arrayAverageScore13 {


    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input13.nextInt();

        int[] score = new int[numberOfStudents];
        double total = 0;
        double average;
        int numPassed = 0;
        int numFailed = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the final score " + i + ": ");
            score[i] = input13.nextInt();

            if (score[i] > 70) {
                numPassed++;
            } else {
                numFailed++;
            }
        }

        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }
        average = total / numberOfStudents;

        System.out.println("The average score of students who passed is " + getAverageScore(numPassed, score));
        System.out.println("The average score of students who failed is " + getAverageScore(numFailed, score));
    }

    private static double getAverageScore(int count, int[] scores) {
        if (count == 0) {
            return 0.0;
        }

        double total = 0;
        for (int i = 0; i < count; i++) {
            total += scores[i];
        }
        return total / count;
    }
}

        