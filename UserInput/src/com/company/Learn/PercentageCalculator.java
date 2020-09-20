package com.company.Learn;

import java.util.Scanner;

public class PercentageCalculator {

    private Scanner sc = new Scanner(System.in);

    private void calculatePercentage() {

        System.out.println("Enter the marks obtained by the student in Mathematics : ");
        float maths = sc.nextFloat();
        if (maths > 100 || maths < 0) {
            System.out.println("Please enter a valid number in the range 0 to 100.");
            System.out.println("Enter the marks obtained by the student in Mathematics : ");
            maths = sc.nextFloat();
        }
        System.out.println("Enter the marks obtained by the student in Science : ");
        float science = sc.nextFloat();
        if (science > 100 || science < 0) {
            System.out.println("Please enter a valid number in the range 0 to 100.");
            System.out.println("Enter the marks obtained by the student in Science : ");
            science = sc.nextFloat();
        }
        System.out.println("Enter the marks obtained by the student in English : ");
        float english = sc.nextFloat();
        if (english > 100 || english < 0) {
            System.out.println("Please enter a valid number in the range 0 to 100.");
            System.out.println("Enter the marks obtained by the student in English : ");
            english = sc.nextFloat();
        }
        System.out.println("Enter the marks obtained by the student in Social Studies : ");
        float socialStudies = sc.nextFloat();
        if (socialStudies > 100 || socialStudies < 0) {
            System.out.println("Please enter a valid number in the range 0 to 100.");
            System.out.println("Enter the marks obtained by the student in Social Studies : ");
            socialStudies = sc.nextFloat();
        }
        System.out.println("Enter the marks obtained by the student in French : ");
        float french = sc.nextFloat();
        if (french > 100 || french < 0) {
            System.out.println("Please enter a valid number in the range 0 to 100.");
            System.out.println("Enter the marks obtained by the student in French : ");
            french = sc.nextFloat();
        }

        float totalMarks = maths + science + english + socialStudies + french;
        float percentObtained = (totalMarks / 500) * 100;
        System.out.println("Percentage obtained by the student = " + percentObtained + "%");

    }

    public static void main(String[] args) {
        PercentageCalculator percentageCalculator = new PercentageCalculator();
        percentageCalculator.calculatePercentage();

    }
}
