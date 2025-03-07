public class arraycontains {  

    public static boolean contains(int[] arr, int targetValue) {  
        for (int element : arr) {  
            if (element == targetValue) {  
                return true; // Found the value!  
            }  
        }  
        return false; // Value not found after checking all elements  
    }  

    public static void main(String[] args) {  
        int[] numbers = {1, 2, 3, 4, 5};  
        int valueToFind = 3;  

        boolean found = contains(numbers, valueToFind);  

        if (found) {  
            System.out.println("The array contains the value " + valueToFind);  
        } else {  
            System.out.println("The array does not contain the value " + valueToFind);  
        }  
    }  
}