package guessingGame;
import java.util.*;
public class guessingGame {
    int ans;
    String result;

    public guessingGame(int ans){
        this.ans = ans;
        this.result = "";
    }

    public String guess(int guess){
        if(guess > this.ans){
            this.result = "high";
            return "too high";
        }
        else if(guess < this.ans){
            this.result = "low";
            return "too low";
        }
        else{
            this.result = "correct";
            return "You win!";
        }
    }

    public boolean solved(){
        if(this.result == "correct"){
            return true;
        }
        else{
            return false;
        }
    }



    

    public static void main(String[] args){
        guessingGame game = new guessingGame((int)Math.floor(Math.random()*(100-0+1)+0));
        int last_guess = -1;
        String last_result = null;
        Scanner input = new Scanner(System.in);

        while(game.solved() == false){
            if(last_guess != -1){ 
                System.out.println("Oops! Your last guess " + last_guess + " was " + last_result + ".");
            }
  
                    System.out.println("Enter your guess: ");
                    last_guess  = input.nextInt();
                    last_result = game.guess(last_guess);
            }
            System.out.println("Congrats! " + last_guess + " was the correct answer!");
        }
       
    }

