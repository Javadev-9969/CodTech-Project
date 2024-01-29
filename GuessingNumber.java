import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        int ans=getRandom();

        System.out.println("You get only 5 chance to guess the number from 1 to 100");
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++){
            int chance=4-i;
            int userNumber=sc.nextInt();
            if(userNumber<0||userNumber>100){
                System.out.println("Entered Number is not in range of 1 to 100");
            }
            if(userNumber==ans){
                System.out.println("You got the correct answer: "+ans);
                return;
            } else if (userNumber<ans) {
                System.out.println("Too low only"+" "+chance+" "+"chance left");
            }
            else{
                System.out.println("Too high only"+" "+chance+" "+"chance left");
            }
        }
        System.out.println("The answer is "+" " +ans+ " Better Luck next time");

    }

    static int getRandom(){
        Random r=new Random();
        int low=0;
        int high=100;
        return r.nextInt(high-low)+low;
    }
}

