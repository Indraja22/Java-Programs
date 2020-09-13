public class Sum3and5Challenge {

    public static void main(String[] args) {
        int i;
        int count = 0;
        int sum = 0;
        for(i = 0; i<=1000;i++){
            if((i%3==0)&&(i%5==0)){

                System.out.println("The numbers that are divisible by both 3 & 5 are : " +i);
                count ++;
                sum = i + sum;
                //System.out.println(sum);
                if(count == 8){
                    //int sum = i;


                    //System.out.println("The numbers are : " +i);
                    break;

                }

                //System.out.println(sum);
            }

        }
        System.out.println("Sum of the 5 numbers is : "+sum);
    }
}
