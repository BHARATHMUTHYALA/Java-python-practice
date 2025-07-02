class Carz{
    public static void main(String[] args){
        Car car = new Car();
        // System.out.println(car.make);
        // System.out.println(car.model);
        // System.out.println(car.color);
        // System.out.println(car.year);
    }
}
 class Car{
    String make ="India";
    String model = "Benz";
    String color = "Red";
    int year = 2012;
    
    public String toString(){
        String myString = make +"\n"+model+"\n"+color+"\n"+year;
        return myString;
    }
}