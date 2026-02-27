
public class Main {

    public static void main(String[] args) {
        System.out.println("\nJava working.\n");


        int[] numbers = new int[]{22, 10, 234, 822, 10000, 999999};
        System.out.println(maxValue(numbers));

        int fizzVal = 100;
        System.out.println(fizzBuzz(fizzVal));


    }

    public static int maxValue(int[] arr) { //my one
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int iterator = 0;
        int maxValueIndex = 0;
        while (iterator < arr.length) {
            if (arr[iterator]>arr[maxValueIndex]) {
                maxValueIndex = iterator;
            }
            iterator++;
        }
        return arr[maxValueIndex];
    }

    public static int maxValueChatGPTVersion(int[] arr) {
    if (arr == null || arr.length == 0) {
        return -1;
    }

    int maxIndex = 0;

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > arr[maxIndex]) {
            maxIndex = i;
        }
    }

    return arr[maxIndex];
}


/*  Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
*/

public static String fizzBuzz(int n) {
    if(n%3==0 && n%5==0) return "FizzBuzz";
    else if(n%3==0) return "Fizz";
    else if(n%5==0) return "Buzz";
    else{ return Integer.toString(n); }
}
//time complexity 0(1)
//space complexity 0(1)

}
