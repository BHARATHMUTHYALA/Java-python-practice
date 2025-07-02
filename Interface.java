class Interface{
    public static void main(String args[]){
        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        Hawk hawk = new Hawk();
        hawk.hunt();
        Fish fish = new Fish();
        fish.hunt();
    }
}

class Rabbit implements Prey{
public void flee(){
    System.out.println("Running away");
}
}

class Hawk implements Predator{
public void hunt(){
    System.out.println("The hawk is hunting");
}
}
class Fish implements Predator, Prey{
public void hunt(){
System.out.println("This fish is hunting smaller fish");
}
public void flee(){
    System.out.println("This fish is being hunted by bigger fish");
}
}
interface Prey{
void flee();
}
interface Predator{
void hunt();
}