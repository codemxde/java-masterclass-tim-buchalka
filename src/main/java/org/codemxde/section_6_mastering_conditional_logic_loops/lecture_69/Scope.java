package org.codemxde.section_6_mastering_conditional_logic_loops.lecture_69;

public class Scope {

    public static void main(String[] args) {
        // scope is weird in switch blocks
        int value = 2;

        switch (value) {
            case 1:
                int i = 10;
                break;
            case 2:
                i = value;
                System.out.println(i);
                break;
        }
    }
}
