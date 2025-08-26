package org.codemxde.section_6_mastering_conditional_logic_loops.lecture_60;

public class DayOfTheWeekChallenge {

    public static void main(String[] args) {
        printDayOfWeek(4);
    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day!";
        };
        System.out.println("Today is " + dayOfWeek);
    }
}
