public class Stringmethods {  

    public static void main(String[] args) {  
        String str1 = "Hello World";  
        String str2 = "hello world";  
        String str3 = "HelloWorld123";  

        // equalsIgnoreCase() - Compares two strings, ignoring case  
        boolean equalsIgnoreCaseResult = str1.equalsIgnoreCase(str2);  
        System.out.println("equalsIgnoreCase: str1 and str2 are equal (ignoring case)? " + equalsIgnoreCaseResult); // true  

        // startsWith() - Checks if a string starts with a specified prefix  
        boolean startsWithResult = str1.startsWith("Hello");  
        System.out.println("startsWith: str1 starts with 'Hello'? " + startsWithResult); // true  

        boolean startsWithResult2 = str1.startsWith("Wor", 6); //Check if string starts with 'Wor' from index 6  
        System.out.println("startsWith: str1 starts with 'Wor' from index 6? " + startsWithResult2); // true  

        // endsWith() - Checks if a string ends with a specified suffix  
        boolean endsWithResult = str1.endsWith("World");  
        System.out.println("endsWith: str1 ends with 'World'? " + endsWithResult); // true  

        // compareTo() - Compares two strings lexicographically (dictionary order)  
        int compareToResult = str1.compareTo(str2);  
        System.out.println("compareTo: str1 compared to str2: " + compareToResult); // Negative value (str1 comes before str2)  

        int compareToResult2 = str1.compareTo(str3);  
        System.out.println("compareTo: str1 compared to str3: " + compareToResult2); // Positive value (str1 comes after str3)  

        int compareToResult3 = str1.compareTo("Hello World");  
        System.out.println("compareTo: str1 compared to 'Hello World': " + compareToResult3); // 0 (equal)  
    }  
}