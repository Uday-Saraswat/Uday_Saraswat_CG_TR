
public class rps {
    public static void main(String[] args) {
        Game g1=new Game();
        g1.rps("rock", "paper");
        g1.rps("paper", "rock");
       g1.rps("paper", "scissors");
        g1.rps("scissors", "scissors");
        g1.rps("scissors", "paper");
    }
}
class Game{
    public void rps(String c1,String c2){
        if(c1==c2){
            System.out.println("TIE");
        }
        if((c1=="rock" && c2=="paper")||(c1=="paper" && c2=="scissors")){
            System.out.println("Player 2 wins");
        }
        if((c1=="paper" && c2=="rock")||(c1=="scissors" && c2=="paper")){
            System.out.println("Player 1 wins");
        }


    }
}




