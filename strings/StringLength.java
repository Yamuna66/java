public class StringLength {  

    public static void main(String[] args) {  

        String myString = "This is a sample string.";  


        int length = myString.length();  

        System.out.println("The length of the string is: " + length);   


        String emptyString = "";  
        int emptyLength = emptyString.length();  

        System.out.println("The length of the empty string is: " + emptyLength);  


        String stringWithSpaces = "   Spaces   ";  
        int spacesLength = stringWithSpaces.length();  

        System.out.println("The length of the string with spaces is: " + spacesLength);   


        String specialChars = "!@#$%^&*()";  
        int specialCharsLength = specialChars.length();  

        System.out.println("The length of the string with special characters is: " + specialCharsLength); 
    }  
}