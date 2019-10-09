import java.util.Scanner;

class ex4{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.println("how long do you want your bar to be");
        int a = sc.nextInt();
        int b = 0;
        System.out.println("what symbol do you want your bar to be made out of");
        String symbol = sc.next();
        while (b<a){
            b++;
            System.out.print(symbol);

        }
    }
}