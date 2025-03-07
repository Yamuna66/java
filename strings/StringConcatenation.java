public class StringConcatenation {  

    public static void main(String[] args) {  

        String str1 = "Hello";  
        String str2 = "World";  

        // Using the + operator to concatenate strings  
        String result = str1 + " " + str2;  // Adds a space between the strings  

        System.out.println(result); // Output: Hello World  

        // Concatenating with other data types  
        int number = 123;  
        String combined = "The number is: " + number;  

        System.out.println(combined); // Output: The number is: 123  

        // More concatenation  
        String moreCombined = str1 + " " + str2 + "! " + combined;  
        System.out.println(moreCombined); // Output: Hello World! The number is: 123  
    }  
}