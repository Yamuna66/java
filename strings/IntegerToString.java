public class IntegerToString{  

    public static void main(String[] args) {  
        // Create an Integer object  
        Integer integerObject = Integer.valueOf(42); // or simply: Integer integerObject = 42; (autoboxing)  

        // Convert Integer object to String using toString()  
        String stringValue1 = integerObject.toString();  
        System.out.println("Using toString(): " + stringValue1);  

        // Convert Integer object to String using String.valueOf()  
        String stringValue2 = String.valueOf(integerObject);  
        System.out.println("Using String.valueOf(): " + stringValue2);  

        //Using String.format()  
        String stringValue3 = String.format("%d", integerObject);  
        System.out.println("Using String.format(): " + stringValue3);  
    }  
}  
