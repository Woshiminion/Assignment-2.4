import java.util.Scanner;

class D6{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        
        int b = 0;
        int sum = 0;
        for(String ans = "y"; ans.equals("y");){
        System.out.println("How many dice do you want");
        int a = sc.nextInt();
        
        for(int x = 0; b<a; b++){
            x =(int) ((Math.random()*6) + 1);
            System.out.print (x+" ");
            sum = sum + x;
            
            
        }
        System.out.println ();
        System.out.println ("your sum is " + sum);
        
        System.out.println ("again? [y,n]");
        ans = sc.next();
        


    }
    }
}