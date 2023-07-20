import java.util.*;
class Casino {

    Player player; 
    Roulette game;

    public Casino(){
      player= new Player("Bella", 100);
      game= new Roulette();
    }

    public void  play(){
     Scanner scan= new Scanner(System.in); 
     while(true){
     System.out.println("How much do you bet? Press 0 if you want to exit");
      int bet= scan.nextInt();
      if(bet==0){
        
        break;
      }   
      if(bet<=player.wallet){
          player.wallet-=bet;
          double winnings= game.placebet(bet);
          player.wallet+=winnings;
          System.out.println("wallet: "+ player.wallet );
      }
      else{
        System.out.println("bet lesser!");
        player.wallet=100;
      }
      if(player.broke()){
        System.out.println("Not enough money, be rich and come with more money, later bye!");
        break;
      }
    }

    }
}