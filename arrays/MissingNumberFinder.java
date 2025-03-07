public class MissingNumberFinder {  

    public static int findMissingNumber(int[] arr) {  
        if (arr == null || arr.length != 99) {  
            throw new IllegalArgumentException("Array must contain 99 elements and not be null.");  
        }  

        int expectedSum = (100 * (100 + 1)) / 2;
        int actualSum = 0;  

        for (int num : arr) {  
            actualSum += num;  
        }  

        return expectedSum - actualSum;  
    }  

    public static void main(String[] args) {  
        int[] numbers = new int[99];  
        int missingNumber = 42; 
        int index = 0;  
        for (int i = 1; i <= 100; i++) {  
            if (i != missingNumber) {  
                numbers[index++] = i;  
            }  
        }  

        int missing = findMissingNumber(numbers);  
        System.out.println("The missing number is: " + missing); 

        
        missingNumber = 7;  
        index = 0;  
        int[] numbers2 = new int[99]; 
        for (int i = 1; i <= 100; i++) {  
            if (i != missingNumber) {  
                numbers2[index++] = i;  
            }  
        }  
        missing = findMissingNumber(numbers2);  
        System.out.println("The missing number is: " + missing); 


        
        int[] shortArray = new int[50];  
        try {  
            missing = findMissingNumber(shortArray);  
        } catch (IllegalArgumentException e) {  
            System.out.println("Caught exception: " + e.getMessage());  
        }  

        int[] longArray = new int[100];  
        try {  
            missing = findMissingNumber(longArray);  
        } catch (IllegalArgumentException e) {  
            System.out.println("Caught exception: " + e.getMessage());  
        }  

        int[] nullArray = null;  
        try {  
            missing = findMissingNumber(nullArray);  
        } catch (IllegalArgumentException e) {  
            System.out.println("Caught exception: " + e.getMessage());  
        }  


    }  
}
