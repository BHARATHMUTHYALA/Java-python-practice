import java.util.ArrayList;

 class FoodList{
    public static void main(String args[]){

        ArrayList<ArrayList<String>> groceryList  = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Donuts");
        bakeryList.add("garlic bread");
        bakeryList.add("Pasta");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("Tomatoes");
        produceList.add("Chilli");
        produceList.add("Sauce");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("Sprite");
        drinksList.add("Fanta");
        drinksList.add("Cola");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        System.out.println(groceryList.get(2).get(0));



    }
}