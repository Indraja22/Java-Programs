package com.company.Learn;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int count = 6;
//        do{
//            System.out.println("Count value was : " +count);
//            count ++;
//            if(count >100){
//                break;
//            }
//        }while (count !=6);
//       boolean res = isEvenNumber(9);
//        System.out.println(res);
    int num = 4;
    int finishNumber = 20;
    int count =0;
    while (num <= finishNumber){
        num++;
        if(!isEvenNumber(num)){
            continue;
        }
        System.out.println(" even number  : " +num);
        count++;
        if(count == 5){
            break;
        }
    }
        System.out.println("Total even numbers found : " +count);

    }
    public static boolean isEvenNumber(int num){
        if (num % 2 ==0){
            return true;
        }
        return false;
    }
}
