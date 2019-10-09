import java.util.Scanner;

class ex3{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        while(a>=0){
            System.out.println("type a number(negative to quit)");
            a =sc.nextInt();
            b = a+b;
            System.out.println(b);
    }
}
}
        