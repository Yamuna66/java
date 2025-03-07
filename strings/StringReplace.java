public class StringReplace {  

    public static void main(String[] args) {  
        String originalString = "Hello World";  

        // Replace all occurrences of 'o' with '0'  
        String replacedString1 = originalString.replace('o', '0');  
        System.out.println("Replaced 'o' with '0': " + replacedString1);  

        // Replace all occurrences of "World" with "Universe"  
        String replacedString2 = originalString.replace("World", "Universe");  
        System.out.println("Replaced 'World' with 'Universe': " + replacedString2);  

        String originalString2 = "This is a string with some  extra spaces.  ";  
        String replacedString3 = originalString2.replace("  ", " "); //Replaces double spaces to single spaces  
        System.out.println("Replaced double spaces with single spaces : " + replacedString3);  
    }  
}