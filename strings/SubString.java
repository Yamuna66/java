public class SubString {  

    public static void main(String[] args) {  

        String myString = "This is a sample string.";  


        String substring1 = myString.substring(5);  
        System.out.println("Substring from index 5: " + substring1);   


        String substring2 = myString.substring(0, 4);  
        System.out.println("Substring from index 0 to 4: " + substring2); 

        String substring3 = myString.substring(8, 14); 
        System.out.println("Substring from index 8 to 14: " + substring3); 


        String substringFromBeginning = myString.substring(0, myString.indexOf(" "));
        System.out.println("Substring from beginning to first space: " + substringFromBeginning);  


        String substringToEnd = myString.substring(myString.lastIndexOf(" ") + 1); 
        System.out.println("Substring from last space to end: " + substringToEnd);  
    }  
}