import java.util.Arrays;  // Import the Arrays class for the toString method (optional, for printing)  

public class copyarray {  

    public static int[] copyArray(int[] sourceArray) {  
        int[] destinationArray = new int[sourceArray.length]; // Create a new array of the same size  
        for (int i = 0; i < sourceArray.length; i++) {  
            destinationArray[i] = sourceArray[i]; // Copy each element  
        }  
        return destinationArray;  
    }  

    public static void main(String[] args) {  
        int[] originalArray = {1, 2, 3, 4, 5};  
        int[] copiedArray = copyArray(originalArray);  

        System.out.println("Original Array: " + Arrays.toString(originalArray));  // Print the original array  
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));    // Print the copied array  

        // Demonstrate that the arrays are independent  
        copiedArray[0] = 100;  // Modify the copied array  

        System.out.println("Original Array after modification: " + Arrays.toString(originalArray));  // Original remains unchanged  
        System.out.println("Copied Array after modification: " + Arrays.toString(copiedArray));    // Copied array reflects the change  
    }  
}