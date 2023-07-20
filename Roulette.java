import java.util.*; 
public class Roulette{
  public Roulette(){

  }
  public double placebet(double bet){
            double winnings= 0;
            
            Scanner scan= new Scanner(System.in); 

            Random rng= new Random();
            int spin=rng.nextInt(37);

            System.out.println("Betting options: "); 
            System.out.println("1 -> Low(1 to 18)\n2-> High(19 to 36) \n3-> Choose a number");
            int choice= scan.nextInt();
        
        

            if (choice == 1  && spin >=1 && spin <=18){
            winnings=2*bet;
            
            
            }
            else if (choice == 2  && spin >=19 && spin <=36){
            winnings=2*bet;
            
            
          } 
          else if(choice==3)
        {
            System.out.println(" What number would you like?");
            int num= scan.nextInt();
            if( num== spin){
            winnings= 35*bet;
            }
          else if(choice>3 && choice<3){
            System.out.println("No option!");
          }
        }
        System.out.println("Spin: " + spin);
        return winnings;

  }
}