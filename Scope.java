import java.util.Random;

class Main{
    public static void main(String args[]){
        Diceroller diceroller= new Diceroller();
    }
}
class Diceroller{

    Random random;
    int number;
    Diceroller(){
        random = new Random();
        
        roll(random, number);
    }
    void roll(Random random, int number){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}