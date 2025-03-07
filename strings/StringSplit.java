import java.util.Arrays;  

public class StringSplit {  

    public static void main(String[] args) {  
        String str = "Hello,World,How,Are,You";  

        // Splitting by a comma (,)  
        String[] parts = str.split(",");  

        System.out.println("Splitting by comma:");  
        System.out.println(Arrays.toString(parts));  

        String str2 = "This is a sentence with multiple spaces";  

        //Splitting by space  
        String[] words = str2.split(" ");  

        System.out.println("Splitting by space:");  
        System.out.println(Arrays.toString(words));  

        String str3 = "File.Name.With.Multiple.Dots";  
        String[] names = str3.split("\\."); //Need to escape the '.'  

        System.out.println("Splitting by dot:");  
        System.out.println(Arrays.toString(names));  

    }  
}  
