public class StickGame {
    private int numRounds;
    private static StickPlayer[] players;
    public StickBoard(int board){
        this.players = players;
        numRounds = 1000;
    }
    public void round(){
        for (int i = 0; i < players.length; i++){
            for(int j = i+1; j < players.length; j++){
                playMatch(players[i], players[j]);
            }

        }
    }




    public int getNum(){
        return
    }


}
