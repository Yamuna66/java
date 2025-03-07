public class verifier {  

    public static boolean containsElements(int[] arr) {  
        if (arr == null || arr.length < 2) {  
            return false; // Array too short to contain both elements  
        }  

        boolean has12 = false;  
        boolean has23 = false;  

        for (int num : arr) {  
            if (num == 12) {  
                has12 = true;  
            } else if (num == 23) {  
                has23 = true;  
            }  
        }  

        return has12 && has23;  
    }  

    public static void main(String[] args) {  
        int[] numbers1 = {1, 5, 12, 8, 3, 23, 4};  
        boolean contains = containsElements(numbers1);  
        System.out.println("Array contains 12 and 23: " + contains); // Output: true  

        int[] numbers2 = {1, 5, 12, 8, 3, 9, 4};  
        contains = containsElements(numbers2);  
        System.out.println("Array contains 12 and 23: " + contains); // Output: false  

        int[] numbers3 = {1, 5, 23, 8, 3, 9, 4};  
        contains = containsElements(numbers3);  
        System.out.println("Array contains 12 and 23: " + contains); // Output: false  

        int[] numbers4 = {12, 23};  
        contains = containsElements(numbers4);  
        System.out.println("Array contains 12 and 23: " + contains); // Output: true  

        int[] numbers5 = {12};  
        contains = containsElements(numbers5);  
        System.out.println("Array contains 12 and 23: " + contains); // Output: false  

        int[] emptyArray = {};  
        contains = containsElements(emptyArray);  
        System.out.println("Array contains 12 and 23: " + contains); // Output: false  

        int[] nullArray = null;  
        contains = containsElements(nullArray);  
        System.out.println("Array contains 12 and 23: " + contains); // Output: false  
    }  
}