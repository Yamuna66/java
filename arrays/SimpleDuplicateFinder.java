import java.util.HashSet;  
import java.util.Set;  

public class SimpleDuplicateFinder {  

    public static void findDuplicates(int[] array) {  
        Set<Integer> seen = new HashSet<>();  
        for (int num : array) {  
            if (!seen.add(num)) {  
                System.out.println("Duplicate: " + num);  
            }  
        }  
    }  

    public static void main(String[] args) {  
        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 3};  
        findDuplicates(numbers); // Output: Duplicate: 2 \n Duplicate: 3  
    }  
}