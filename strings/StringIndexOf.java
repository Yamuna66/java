public class StringIndexOf {  

    public static void main(String[] args) {  
        String str = "Hello World";  

        // Find the index of "World"  
        int index1 = str.indexOf("World");  
        System.out.println("Index of 'World': " + index1); // Output: 6  

        // Find the index of "o" (first occurrence)  
        int index2 = str.indexOf("o");  
        System.out.println("Index of 'o': " + index2);   // Output: 4  

        // Find the index of "o" starting from index 5  
        int index3 = str.indexOf("o", 5);  
        System.out.println("Index of 'o' starting from index 5: " + index3); // Output: 7  

        // Find the index of a character that doesn't exist  
        int index4 = str.indexOf("Z");  
        System.out.println("Index of 'Z': " + index4);   // Output: -1  

        // Find the index of an empty string  
        int index5 = str.indexOf("");  
        System.out.println("Index of '': " + index5);  // Output: 0  

        String str2 = "abababab";  
        int index6 = str2.indexOf("ab", 2);  
        System.out.println("Index of 'ab' starting from index 2: " + index6); // Output: 2  
    }  
}  
