public class Overloadconstructor{
    public static void main(String args[]){
        Pizza pizza = new Pizza("thicc crust", "Tomato");
        System.out.println("The ingredients are: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.sauce);
        System.out.println(pizza.topping);
    }
}
class Pizza{
    String bread;
    String cheese;
    String sauce;
    String topping;

    Pizza (String bread,String cheese,String sauce,String topping){
        this.bread = bread;
        this.sauce =sauce;
        this.cheese =cheese;
        this.topping=topping;
    }
    Pizza (String bread,String sauce,String cheese){
        this.bread = bread;
        this.sauce =sauce;
        this.cheese =cheese;
    }
    Pizza (String bread,String sauce){
        this.bread = bread;
        this.sauce =sauce;
    }

}