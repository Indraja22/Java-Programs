public class Main {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet < 0 || (inches < 0 || inches >12)){
            System.out.println("Invalid parameters");
            return -1;
        }
            double centimeters = feet * 30.48;
            centimeters +=inches * 2.54;
            System.out.println(feet + " feet and " +inches+ " inches = " +centimeters+"cm");
            return centimeters;

}
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0){
            System.out.println("Invalid value of inch is passed.");
            return -1;
    }
        double feet = (int) inches/12;
        double remainingInches = (int) inches%12;
        System.out.println(inches+ " inches is equal to "+feet + " feet and "+remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }

    public static void main(String[] args) {
//            calcFeetAndInchesToCentimeters(6,0);
//        calcFeetAndInchesToCentimeters(7,5);
//        calcFeetAndInchesToCentimeters(-8,5);
        calcFeetAndInchesToCentimeters(157);
    }
}
