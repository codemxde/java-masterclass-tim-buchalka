package org.codemxde.section_5_mastering_java_expressions.coding_exercise_12;

public class PlayingCat {

    public static void main(String[] args) {

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature < 25 || temperature > 45) return false;

        return temperature <= 35 || summer;
    }

}
