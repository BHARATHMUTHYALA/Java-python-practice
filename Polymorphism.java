class Polymorphism{
    public static void main(String[] args){
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat};
        for(Vehicle x:racers){
            x.go();
        }
    }
}
class Vehicle{
public void go(){}
    
}
class Bicycle extends Vehicle{
    public void go(){
    System.out.println("Cycle pedalling started");
    }
}
class Car extends Vehicle{
public void go(){
    System.out.println("Car engine started");
}
}
class Boat extends Vehicle{
    public void go(){
    System.out.println("Boat engine started");
    }
}