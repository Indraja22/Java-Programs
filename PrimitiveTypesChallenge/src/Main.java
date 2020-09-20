public class Main {

    public static void main(String[] args) {

        byte myFirstByte = 50;
        short myFirstShort = 90;
        int myFirstInt = 120;
        long myFirstLong = (long)(50000 + 10*(myFirstByte + myFirstInt + myFirstShort));
        System.out.println(myFirstLong);

        short shortTotal = (short) (1000 + 10 * (myFirstByte + myFirstInt + myFirstShort));
        System.out.println(shortTotal);
    }
}
