import java.util.ArrayList;

class EachBOI{
    public static void main(String args[]){
        //String[] animals = {"CAT","RAT","BIRD"};
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Dog");
        animals.add("rat");
        animals.add("bird");    
        
        for(String i : animals){
            System.out.println(i);
        }
    }
}