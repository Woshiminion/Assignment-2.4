import java.util.Scanner;

class ex5{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How tall do you want your triangle to be");
        int b = sc.nextInt();
        System.out.println("What do you want it to be made of");
        String c = sc.next();
        for (int a = 0; a<b; a++){
            for (int d = 0; d<a; d++){
                System.out.print(c);
            }
            System.out.println(c);

            
        }
    }
}