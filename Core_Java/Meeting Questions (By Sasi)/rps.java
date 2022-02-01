
public class rps {
    public static void main(String[] args) {
        turn chance =new turn();
        
        chance.rps("rock", "paper");
        chance.rps("paper", "rock");
        chance.rps("paper", "scissors");
        chance.rps("scissors", "scissors");
        chance.rps("scissors", "paper") ;
        
    }
}
class turn{
    public void rps(String player1,String player2){
        if(player1==player2){
            System.out.println("TIE");
        }
        if((player1=="rock" && player2=="paper")||(player1=="paper" && player2=="scissors")){
            System.out.println("Player 2 wins");
        }
        if((player1=="paper" && player2=="rock")||(player1=="scissors" && player2=="paper")){
            System.out.println("Player 1 wins");
        }


    }
}




