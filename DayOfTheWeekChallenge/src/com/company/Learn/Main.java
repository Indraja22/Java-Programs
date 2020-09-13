package com.company.Learn;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printDayOfTheWeek(5);
        printDayOfTheWeek(8);
        printDayOfTheWeek(0);
    }

    private static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            default:
                System.out.println("Invalid day");
        }
    }
}
