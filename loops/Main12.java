import java.util.Scanner;
public class Main12 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter M for male and F for female");
        char gen=sc.next().charAt(0);
        switch(gen){
            case 'M':
            case 'm':
                System.out.println("Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        }
}

