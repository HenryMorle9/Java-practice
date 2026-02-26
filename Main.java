import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nJava working.\n");


        int[] numbers = new int[]{22, 10, 234, 822, 10000, 999999};

        System.out.println(maxValue(numbers));

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


public static char firstNonRepeating(String s) {
    //Use HashMap<Character, Integer>
    //Return '_' if none found
    //Case sensitive
    //O(n)

    // If string is null or empty, no character can be non-repeating
    if (s == null || s.length() == 0) {
        return '_';
    }

    // Create a HashMap to store character frequencies
    HashMap<Character, Integer> frequencyMap = new HashMap<>();

    // First pass: count how many times each character appears
    for (int i = 0; i < s.length(); i++) {

        // Get current character
        char c = s.charAt(i);

        // If character already exists in map, increment its count
        if (frequencyMap.containsKey(c)) {
            frequencyMap.put(c, frequencyMap.get(c) + 1);
        } 
        // Otherwise, add it to map with count 1
        else {
            frequencyMap.put(c, 1);
        }
    }

    // Second pass: find the first character with frequency 1
    for (int i = 0; i < s.length(); i++) {

        // Get current character
        char c = s.charAt(i);

        // If its frequency is 1, return it immediately
        if (frequencyMap.get(c) == 1) {
            return c;
        }
    }

    // If no non-repeating character was found, return '_'
    return '_';
}

}
