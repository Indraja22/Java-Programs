package com.company.Learn;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int result = 1 + 2;
//        System.out.println("1+2 = " +result);
//        int previousResult = result;
//        result =result - 1;
//        System.out.println(previousResult - 1);
//        result = result * 10;
//        System.out.println("2*10=" +result);
//
//        result = result/10;
//        System.out.println("20/10 = " +result);
//
//        result = result % 3;
//        System.out.println("2%3 = " +result);
//        result = result + 1;
//        result ++;
//        result --;
//        System.out.println(result);
//        //result = result + 2;
//        result+=2;
//        result*=10;
//        System.out.println(result);
//        result/=10;
//        System.out.println(result);
//        result-=2;
//        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("It is not ALIEN!");
            System.out.println("I am scared of ALIENS");
    }
        int topScore = 80;
        if (topScore <= 100){
            System.out.println("You got highest score!");
        }

        int secondTopScore = 95;
        if((topScore >secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90) ){
            System.out.println("Either or both the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("Assignment Operator is: ==");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println("This should not happen");
        }

    }
}
