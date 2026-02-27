
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nJava working.\n");


        int[] numbers = new int[]{22, 10, 234, 822, 10000, 999999};
        System.out.println(maxValue(numbers));

        int fizzVal = 100;
        System.out.println(fizzBuzz(fizzVal));

        int[] repeatedNumberExample = new int[]{4, 7, 1, 7, 3, 4};
        // Uncomment after you complete firstRepeatedNumber:
        // System.out.println(firstRepeatedNumber(repeatedNumberExample));


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

/*
Problem: First Repeated Number (HashMap Beginner)

Description:
Given an integer array nums, return the first value that appears more than once
while scanning from left to right.

Rules:
1) If a number appears again, return that number immediately.
2) If no number repeats, return -1.
3) Use a HashMap to track numbers you have already seen.

Example:
Input:  [4, 7, 1, 7, 3, 4]
Output: 7
Reason: 7 is the first value that repeats as you move left to right.
*/
public static int firstRepeatedNumber(int[] nums) {

    // Create a HashMap to track numbers we have already seen.
    // Key   = the number from the array
    // Value = dummy value (we don't actually care about the count here)
    HashMap<Integer, Integer> seen = new HashMap<>();

    // Loop through each number in the array from left to right
    for (int num : nums) {

        // Check if we've already seen this number before
        if (seen.containsKey(num)) {

            // If yes, this is the first repeated number.
            // We return it immediately.
            return num;   // <- small improvement (explained below)
        }

        // If the number has not been seen yet,
        // add it to the map so we remember it.
        seen.put(num, 1);
    }

    // If we finish the loop without finding any repeat,
    // then no number was repeated.
    return -1;
}

/*
Problem: First Unique Number

Description:
Given an integer array nums, return the first value that appears exactly once
while scanning from left to right.

Rules:
1) If a number appears only once in the entire array, it is considered unique.
2) Return the first unique value encountered when scanning left to right.
3) If no unique value exists, return -1.
4) Use a HashMap to track frequencies.
5) Time complexity must be O(n).

Example:
Input:  [4, 7, 1, 7, 3, 4]
Output: 1
Reason: 1 is the first value that appears exactly once.
*/

public static int firstUniqueNumber(int[] nums) {

    HashMap<Integer, Integer> map = new HashMap<>();


for (int num : nums) {
    if (map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
    } else {
        map.put(num, 1);
    }
}

for (int num : nums) {
    if (map.get(num) == 1) {
        return num;
    }
}
 return -1;
}

}
