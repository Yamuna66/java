import java.util.Arrays;
import java.util.HashSet;  
import java.util.Set;  

public class duplicateremover {  

    public static int[] removeDuplicates(int[] arr) {  
        if (arr == null || arr.length == 0) {  
            return new int[0]; // Return an empty array for null or empty input  
        }  

        // Use a Set to store unique elements (duplicates are automatically ignored)  
        Set<Integer> uniqueElements = new HashSet<>();  

        // Add elements from the input array to the Set  
        for (int num : arr) {  
            uniqueElements.add(num);  
        }  

        // Create a new array to store the unique elements  
        int[] result = new int[uniqueElements.size()];  
        int index = 0;  

        // Copy the unique elements from the Set to the new array  
        for (int num : uniqueElements) {  
            result[index++] = num;  
        }  

        return result;  
    }  

    public static void main(String[] args) {  
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};  
        int[] uniqueNumbers = removeDuplicates(numbers);  
        System.out.println("Original array: " + Arrays.toString(numbers));  
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueNumbers));  
        // Expected Output:  
        // Original array: [1, 2, 2, 3, 4, 4, 5]  
        // Array with duplicates removed: [1, 2, 3, 4, 5] (order may vary)  

        int[] emptyArray = {};  
        int[] uniqueEmpty = removeDuplicates(emptyArray);  
        System.out.println("Original array: " + Arrays.toString(emptyArray));  
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueEmpty));  
        // Expected Output:  
        // Original array: []  
        // Array with duplicates removed: []  

        int[] allSame = {3, 3, 3, 3};  
        int[] uniqueSame = removeDuplicates(allSame);  
        System.out.println("Original array: " + Arrays.toString(allSame));  
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueSame));  
        // Expected Output:  
        // Original array: [3, 3, 3, 3]  
        // Array with duplicates removed: [3]  

        int[] nullArray = null;  
        int[] uniqueNull = removeDuplicates(nullArray);  
        System.out.println("Original array: null"); //Can't print null array with Arrays.toString  
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueNull));  
        // Expected Output:  
        // Original array: null  
        // Array with duplicates removed: []  
    }  
}
