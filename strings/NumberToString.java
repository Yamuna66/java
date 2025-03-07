public class NumberToString {  

    public static void main(String[] args) {  
        int intValue = 123;  
        double doubleValue = 45.67;  
        float floatValue = 89.0f;  
        long longValue = 1234567890L;  
        boolean booleanValue = true; // Or false  

        // Convert int to String  
        String intString = String.valueOf(intValue);  
        System.out.println("int to String: " + intString);  

        // Convert double to String  
        String doubleString = String.valueOf(doubleValue);  
        System.out.println("double to String: " + doubleString);  

        // Convert float to String  
        String floatString = String.valueOf(floatValue);  
        System.out.println("float to String: " + floatString);  

        // Convert long to String  
        String longString = String.valueOf(longValue);  
        System.out.println("long to String: " + longString);  

        // Convert boolean to String  
        String booleanString = String.valueOf(booleanValue);  
        System.out.println("boolean to String: " + booleanString);  
    }  
}  
