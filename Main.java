

public class Main {

    public static void main(String[] args) {
        System.out.println("\nJava working.\n");


        int[] numbers = new int[]{22, 10, 234, 822, 10000, 999999};

        System.out.println(maxValue(numbers));

    }

    public static int maxValue(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int iterator = 0;
        int maxValueIndex = 0;
        while (iterator <= arr.length-1) {
            if (arr[iterator]>arr[maxValueIndex]) {
                maxValueIndex = iterator;
            }
            iterator++;
        }
        return arr[maxValueIndex];
    }
}
