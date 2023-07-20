public class Player{
String name;
double wallet;
Player(String n, double w){
  name=n;
  wallet=w;
}
public boolean broke(){
  return wallet <= 0;
}



}