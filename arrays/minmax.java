public class minmax {  

    public static int[] findMinMax(int[] array) {  
        if (array == null || array.length == 0) {  
            return null; // Or throw an exception, depending on your needs  
        }  

        int min = array[0];  
        int max = array[0];  

        for (int i = 1; i < array.length; i++) {  
            if (array[i] < min) {  
                min = array[i];  
            }  
            if (array[i] > max) {  
                max = array[i];  
            }  
        }  

        return new int[]{min, max}; // Returns an array containing min and max  
    }  

    public static void main(String[] args) {  
        int[] numbers = {5, 2, 9, 1, 5, 6};  
        int[] minMax = findMinMax(numbers);  

        if (minMax != null) {  
            System.out.println("Minimum: " + minMax[0]);  
            System.out.println("Maximum: " + minMax[1]);  
        } else {  
            System.out.println("Array is empty or null.");  
        }  
    }  
}
    

