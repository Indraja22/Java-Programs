package com.company.Learn;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
	// write your code here
        getDurationString(500,66);
        getDurationString(3945);
        getDurationString(-41);
    }

    public static String getDurationString(int minutes, int seconds){
        int hour;
        int remainingHours;
        if (minutes < 0 || (seconds < 0 || seconds > 59 )){
            return INVALID_VALUE_MESSAGE;
        }else {
             hour = minutes/60;
             remainingHours = minutes % 60;
             String hoursString = hour + "h";
             if(hour < 10){
                 hoursString = "0" + hoursString;
             }

            //int newMinutes = remainingHours * 60
            System.out.println(hoursString+ " hr "+remainingHours+ " m " +seconds+ " s");
            String time = hour + " h " +remainingHours+ " m " +seconds+ " s ";
            return time;
        }
}
    public static String getDurationString(int seconds){
        if (seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }else {
            int minutesInSeconds = seconds/60;
            int remainingSeconds = seconds % 60;
           // getDurationString(minutesInSeconds,remainingSeconds);
            return getDurationString(minutesInSeconds,remainingSeconds);
        }
    }
}
