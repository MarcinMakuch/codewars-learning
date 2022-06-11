package com.company.nauka;

public class TimeDifference {
    public static void main(String[] args) {
        String timeDiff = "12:30pm-12:00am";
        String[] timeSplit = timeDiff.split("-");
        String timeStartArr = timeSplit[0];
        timeStartArr = timeStartArr.replaceAll("[a-z]", "");
        String timeEndArr = timeSplit[1];
        timeEndArr = timeEndArr.replaceAll("[a-z]", "");


    }
}
