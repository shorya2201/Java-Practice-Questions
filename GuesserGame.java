import java.util.*;

class Guesser {
    int GuessNum() {
        System.out.println("Hey I'm Guesser! Kindly guess the number.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }
}

class Player {
    int guessing_Num() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey Player ! Kindly Guess the number.");
        int guessnum = sc.nextInt();
        return guessnum;
    }
}

class Umpire {
    Player p1 = new Player();
    Guesser g1 = new Guesser();

    void judging() {
        int correct_num = g1.GuessNum();
        int player_num = p1.guessing_Num();
        if (player_num == correct_num) {
            System.out.println("Congratulations!!!!Player 1 have won the match.You guessed it right!!");
        } else {
            System.out.println("Ooops!!!Wrong Guess....Please Try again.");
        }
    }
}

public class GuesserGame {

    public static void main(String[] args) {
        Umpire u1 = new Umpire();
        u1.judging();

    }
}
