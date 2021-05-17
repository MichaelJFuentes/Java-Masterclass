package FlowControl;

public class PaintJob {
    public static void main(String[] args) {
        int holder = getBucketCount(3.26,.75);
        System.out.println(holder);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double areaToCover = width * height;
        areaToCover -= (areaPerBucket * extraBuckets);
        double bucketsNeeded = areaToCover / areaPerBucket;
        return (int)Math.ceil(bucketsNeeded);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int)Math.ceil(area / areaPerBucket);
    }
}
