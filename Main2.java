class Main2{
    public static void main(String args[]){
        Car myCar = new Car();
        // String x=myCar.model;
        // System.out.println(x);
        myCar.drive();
        myCar.brake();
        
            }
}
 class Car{
    String make ="Mustang";
    String model = "2020";
    int year = 2049;
    String color ="Blue";
    double price = 500000000.0;

    void drive(){
        System.out.println("You drive the car");
    }
    void brake(){
        System.out.println("Stop the car immediately");
    }


}