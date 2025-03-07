import java.util.ArrayList;  
import java.util.List;  

public class CommonValuesFinder {  

    public static List<Integer> findCommonValues(int[] array1, int[] array2) {  
        List<Integer> commonValues = new ArrayList<>();  

        for (int num1 : array1) {  
            for (int num2 : array2) {  
                if (num1 == num2 && !commonValues.contains(num1)) {  
                    commonValues.add(num1);  
                }  
            }  
        }  

        return commonValues;  
    }  

    public static void main(String[] args) {  
        int[] array1 = {1, 2, 3, 4, 5};  
        int[] array2 = {3, 5, 6, 7, 8};  

        List<Integer> common = findCommonValues(array1, array2);  

        System.out.println("Common values: " + common); // Output: Common values: [3, 5]  
    }  
}
