import java.util.Scanner;

public class StickGame {
    private static StickPlayer[] players;

    public StickBoard(int board) {
        this.players = players;
    }

    public static void main(String args) {

        int numSticks = (int) (Math.random() * 40) + 25;
        System.out.println("Do you want to go first? (Yes or No)");
        Scanner scanner = new Scanner(System.in);
        String goFirst = scanner.nextLine();
       // Scanner take = new Scanner(System.in);
        int input = 0;
        boolean playerzTurn = goFirst.equals("Yes") || goFirst.equals("yes");

        while (numSticks > 1) {
            if (playerzTurn == true) {
                System.out.println("There are " + numSticks + " sticks.");
                System.out.println("Do you want to take 1, 2, or 3 sticks?");
                input = scanner.nextInt();
                playerzTurn = false;
                numSticks = numSticks - input;

                // now the stick ai goes
                // print ln statement about how many sticks ai took and how many are left
                //playerzTurn = true;

            }

            if(playerzTurn == false) {
                //ai turn
                //playerzturn = false
                // numSticks counter
                //playerzturn = true
            }
        }

        if (playerzTurn == false){
            System.out.println("You Win!");
        }
        System.out.println("You Lose!");
    }
}
