public class Logical {
    public static void main(String[] args){
        int a = 20;
        int b = 25;
        int c = 33;
        boolean result1 = a<b&&a<c;
        System.out.println("Result1:"+result1);
        
    boolean result2 = a>b&&a>c;
    System.out.println("Result2:"+result2);
    boolean result3 = a<b&&a>c;
        System.out.println("Result3:"+result3);
}
}
