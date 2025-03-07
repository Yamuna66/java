import java.util.Arrays;  

public class InsertElement {  

    public static int[] insertElement(int[] originalArray, int elementToInsert, int position) {  
        int originalLength = originalArray.length;  

        // Check if the position is valid  
        if (position < 0 || position > originalLength) {  
            System.out.println("Invalid position. Returning original array.");  
            return originalArray; // Or throw an exception if you prefer  
        }  

        int[] newArray = new int[originalLength + 1]; // Create a new array with increased size  

        // Copy elements before the insertion point  
        for (int i = 0; i < position; i++) {  
            newArray[i] = originalArray[i];  
        }  

        // Insert the new element  
        newArray[position] = elementToInsert;  

        // Copy the remaining elements after the insertion point  
        for (int i = position; i < originalLength; i++) {  
            newArray[i + 1] = originalArray[i];  
        }  

        return newArray;  
    }  

    public static void main(String[] args) {  
        int[] originalArray = {1, 2, 3, 4, 5};  
        int elementToInsert = 10;  
        int position = 2; // Insert at index 2 (between 2 and 3)  

        int[] newArray = insertElement(originalArray, elementToInsert, position);  

        System.out.println("Original Array: " + Arrays.toString(originalArray));  
        System.out.println("New Array after insertion: " + Arrays.toString(newArray));  

        // Example with an invalid position  
        int[] invalidArray = insertElement(originalArray, 20, 10);  
        System.out.println("Array after invalid insertion attempt: " + Arrays.toString(invalidArray)); //Will return orignal array.  
    }  
}
