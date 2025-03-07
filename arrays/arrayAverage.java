public class arrayAverage {  

    public static double calculateAverage(int[] arr) {  
        if (arr == null || arr.length == 0) {  
            return 0.0; // Avoid division by zero and handle empty arrays  
        }  

        int sum = 0;  
        for (int number : arr) {  
            sum += number;  
        }  

        return (double) sum / arr.length; // Cast sum to double for accurate average  
    }  

    public static void main(String[] args) {  
        int[] numbers = {1, 2, 3, 4, 5};  
        double average = calculateAverage(numbers);  
        System.out.println("The average of the array is: " + average); // Output: The average of the array is: 3.0  
    }  
}
