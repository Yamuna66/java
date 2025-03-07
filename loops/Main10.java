public class Main10 {
    public static void main(String args[]){
        int n=121;
        int sum=0;
        int rem, temp;
        temp=n;
        while(n!=0){
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
    }
}
