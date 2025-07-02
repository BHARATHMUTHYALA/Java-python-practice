public class Objects{
    public static void main(String args[]){
    //Food[] fridge = new Food[3];
    Food food1 = new Food("Pizza");
    Food food2 = new Food("Dosa");
    Food food3 = new Food("Idli");

    Food[] fridge = {food1, food2, food3};
   
    System.out.println(fridge[0].name);
    System.out.println(fridge[1].name);
    System.out.println(fridge[2].name);
    }
}

class Food{
    String name;
    Food(String name){
        this.name = name;

    }
}