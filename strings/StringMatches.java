public class StringMatches {  

    public static void main(String[] args) {  
        String str1 = "12345";  
        String str2 = "abcde";  
        String str3 = "123ab";  
        String str4 = "1234567";  

        // Regular expression to match a string containing only digits  
        String regex1 = "\\d+";  //  \d means "digit", + means "one or more" (need to escape the backslash)  

        // Regular expression to match a string containing exactly 5 digits  
         String regex2 = "\\d{5}"; // \d means "digit", {5} means "exactly 5 times"  

        // Test str1 against regex1 (all digits)  
        boolean matches1 = str1.matches(regex1);  
        System.out.println(str1 + " matches " + regex1 + ": " + matches1); // true  

        // Test str2 against regex1 (all digits)  
        boolean matches2 = str2.matches(regex1);  
        System.out.println(str2 + " matches " + regex1 + ": " + matches2); // false  

         // Test str3 against regex1 (all digits)  
        boolean matches3 = str3.matches(regex1);  
        System.out.println(str3 + " matches " + regex1 + ": " + matches3); // false  

        // Test str1 against regex2 (exactly 5 digits)  
        boolean matches4 = str1.matches(regex2);  
        System.out.println(str1 + " matches " + regex2 + ": " + matches4); // true  

        // Test str4 against regex2 (exactly 5 digits)  
        boolean matches5 = str4.matches(regex2);  
        System.out.println(str4 + " matches " + regex2 + ": " + matches5); // false  

        String str5 = "hello123world";  
        String regex3 = "hello.*world"; //".*" means anything between "hello" and "world"  
        boolean matches6 = str5.matches(regex3);  
        System.out.println(str5 + " matches " + regex3 + ": " + matches6); //true  
    }  
}  
 
