package org.codemxde.section_6_mastering_conditional_logic_loops.coding_exercises.coding_exercise_29;

public class PaintJob {

    // write code here
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;

        double areaOfWall = width * height;

        double existingSupply = (double) (extraBuckets * areaPerBucket);

        double remainingArea = areaOfWall - existingSupply;

        return (int) Math.ceil(remainingArea / areaPerBucket);

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;

        double areaOfWall = width * height;

        return (int) Math.ceil(areaOfWall / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) return -1;

        return (int) Math.ceil(area / areaPerBucket);
    }
}
