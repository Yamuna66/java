public class StringEquals{  

    public static void main(String[] args) {  
        String str1 = "Hello";  
        String str2 = "Hello";  
        String str3 = new String("Hello");  
        String str4 = "World";  

        // Using equals() to compare str1 and str2 (same content, same object - often, but not guaranteed)  
        boolean equals1 = str1.equals(str2);  
        System.out.println("str1.equals(str2): " + equals1); // true  

        // Using equals() to compare str1 and str3 (same content, different object)  
        boolean equals2 = str1.equals(str3);  
        System.out.println("str1.equals(str3): " + equals2); // true  

        // Using equals() to compare str1 and str4 (different content)  
        boolean equals3 = str1.equals(str4);  
        System.out.println("str1.equals(str4): " + equals3); // false  

        // Using == to compare str1 and str2 (same content, same object - often, but not guaranteed)  
        boolean equals4 = (str1 == str2);  
        System.out.println("str1 == str2: " + equals4); // true (likely, but depends on JVM string pooling)  

       // Using == to compare str1 and str3 (same content, different object)  
        boolean equals5 = (str1 == str3);  
        System.out.println("str1 == str3: " + equals5); // false (almost always)  
    }  
}  
