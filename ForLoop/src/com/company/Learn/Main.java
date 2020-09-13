package com.company.Learn;

public class Main {

    public static void main(String[] args) {

        int count=0;

        for(int i=10;i<=50;i++){
            if(isPrime(i)) {
                count++;
                System.out.println("The prime number is : " + i);
                if (count == 10) {
                    System.out.println("Exiting For Loop");
                    break;
                }
            }
        }
	// write your code here

       // calculateInterest(50000);

//        for(int i = 0;i<5;i++){
//            System.out.println(i);
//        }
//
    }

//    public static  double calculateInterest(double amount){
//       // return(amount *(interestRate/100));
//        double interest = 0;
//        for(int i =8 ; i >1; i--){
//            interest =  amount *(i/100f);
//            System.out.println("10,000 at "+ i +"% interest : " +String.format("%.2f",interest));
//        }
//        return interest;
//    }

    public static boolean isPrime(int n){

        if(n == 1){
            return false;
        }
        for(int i = 2; i<=(long)Math.sqrt(n);i++){
            //System.out.println(i);
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }


}
