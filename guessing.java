import java.util.Scanner;

class guessing{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double x = (int) (Math.random()*100 + 1);
        System.out.println("Guess a number from 1 - 100");
        int answer = sc.nextInt();
        while (answer > x){
            System.out.println("too high");
            System.out.println("Guess a number");
            answer = sc.nextInt();
        }while(answer < x){
            System.out.println("too low");
            System.out.println("Guess a number");
            answer = sc.nextInt();
        }
        System.out.println("you got it!");

        
        
        
        
        
    }
}

