package org.codemxde.section_6_mastering_conditional_logic_loops.lecture_58;

public class Main {

    public static void main(String[] args) {
        // Advanced Switch Statements
        System.out.println(getQuarter("wkebw"));
        System.out.println(getQuarterEnhanced("Julyyyy"));
    }

    public static String getQuarterEnhanced(String month) {
        return switch (month.toLowerCase()) {
            case "january", "february", "march" -> "first quarter";
            case "april", "may", "june" -> "second quarter";
            case "july", "august", "september" -> "third quarter";
            case "october", "november", "december" -> "fourth quarter";
            default -> {
                String badResponse = month + " is not a valid month!";
                yield badResponse;
            }
        };
    }

    public static String getQuarter(String month) {

        switch (month.toUpperCase()) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "This is the first quarter";
            case "APRIL": case "MAY": case "JUNE":
                return "This is the second quarter";
            case "JULY": case "AUGUST": case "SEPTEMBER":
                return "This is the third quarter";
            case "OCTOBER": case "NOVEMBER": case "DECEMBER":
                return "This is the final quarter";
        }

        return "Invalid Month!";
    }
}
