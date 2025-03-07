public class StringCreation {  

    public static void main(String[] args) {  


        String str1 = "Hello";  
        String str2 = "Hello"; 

        System.out.println("String Literal:");  
        System.out.println("str1: " + str1);  
        System.out.println("str2: " + str2);  
        System.out.println("str1 == str2: " + (str1 == str2)); 
        String str3 = new String("World");  
        String str4 = new String("World");
        System.out.println("\nUsing 'new' Keyword:");  
        System.out.println("str3: " + str3);  
        System.out.println("str4: " + str4);  
        System.out.println("str3 == str4: " + (str3 == str4));  
        System.out.println("str3.equals(str4): " + str3.equals(str4)); 


        char[] charArray = {'J', 'a', 'v', 'a'};  
        String str5 = new String(charArray);  

        System.out.println("\nFrom char array:");  
        System.out.println("str5: " + str5);  


        int num = 123;  
        String str6 = String.valueOf(num);  

        double decimal = 3.14;  
        String str7 = String.valueOf(decimal);  

        boolean flag = true;  
        String str8 = String.valueOf(flag);  

        System.out.println("\nUsing String.valueOf():");  
        System.out.println("str6 (from int): " + str6);  
        System.out.println("str7 (from double): " + str7);  
        System.out.println("str8 (from boolean): " + str8);  

        StringBuilder sb = new StringBuilder();  
        sb.append("String ");  
        sb.append("built ");  
        sb.append("using ");  
        sb.append("StringBuilder");  
        String str9 = sb.toString();  

        System.out.println("\nUsing StringBuilder:");  
        System.out.println("str9: " + str9);  
    }  
}