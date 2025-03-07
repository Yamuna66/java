import java.util.Arrays;  

public class RemoveDuplicates {  

    public static int[] removeDuplicates(int[] arr) {  
        if (arr == null || arr.length == 0) {  
            return arr; // Handle empty or null array  
        }  

        Arrays.sort(arr); // Sort to group duplicates  

        int uniqueIndex = 0; // Index to track unique elements  
        for (int i = 1; i < arr.length; i++) {  
            if (arr[i] != arr[uniqueIndex]) {  
                uniqueIndex++;  
                arr[uniqueIndex] = arr[i]; // Move unique element to its new position  
            }  
        }  

        // Create a new array with only unique elements  
        return Arrays.copyOfRange(arr, 0, uniqueIndex + 1);  
    }  

    public static void main(String[] args) {  
        int[] numbers = {1, 2, 2, 3, 4, 4, 4, 5};  
        int[] uniqueNumbers = removeDuplicates(numbers);  

        System.out.println("Original array: " + Arrays.toString(numbers));  
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueNumbers));  
    }  
}
