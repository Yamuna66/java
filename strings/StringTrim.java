public class StringTrim {  

    public static void main(String[] args) {  
        String strWithWhitespace = "   Hello, World!   ";  
        String trimmedString = strWithWhitespace.trim();  

        System.out.println("Original string: \"" + strWithWhitespace + "\"");  
        System.out.println("Trimmed string:  \"" + trimmedString + "\"");  
    }  
}  