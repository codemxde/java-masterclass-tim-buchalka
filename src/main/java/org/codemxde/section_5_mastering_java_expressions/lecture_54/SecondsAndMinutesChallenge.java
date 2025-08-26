package org.codemxde.section_5_mastering_java_expressions.lecture_54;

class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(7925));
        System.out.println(getDurationString(65, 23));

        // Invalid Cases
        System.out.println(getDurationString(-34));
        System.out.println(getDurationString(-2, 30));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) return "Invalid Seconds!";

        int minutes = seconds / 60;
        seconds %= 60;

        return getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes , int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) return "Invalid Minutes Or Seconds!";

        int hours = minutes / 60;
        minutes %= 60;
        String time = "'" + hours + "h " + minutes + "m " + seconds + "s'";

        return time;
    }
}
