package com.amazon.BroShaver.Section5ControlFlowStatements;

public class paintJob {
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double areaOfWall = height * width;
        double areaCoveredByCurrentBuckets = areaPerBucket * extraBuckets;
        double remainingAreaNeeded = areaOfWall - areaCoveredByCurrentBuckets;
        if (remainingAreaNeeded <= 0) {
            return 0;
        }
        double bucketsNeeded = Math.ceil(remainingAreaNeeded / areaPerBucket);
        int finalBuckets = (int)bucketsNeeded;
        return finalBuckets;
    }
    public static int getBucketCount (double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double areaOfWall = height * width;
        double bucketsNeeded = Math.ceil(areaOfWall / areaPerBucket);
        int finalBuckets = (int)bucketsNeeded;
        return finalBuckets;
    }
    public static int getBucketCount (double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double bucketsNeeded = Math.ceil(area / areaPerBucket);
        int finalBuckets = (int)bucketsNeeded;
        return finalBuckets;
    }
}
