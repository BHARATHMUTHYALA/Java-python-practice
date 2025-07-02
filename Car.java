public class Car
{
private String model;
private String make;
private int year;
Car(String make, String model, int year){
    this.setMake(make); 
    this.setYear(year);
    this.setModel(model);

}

public String getMake(){
    return make;
}
public String getModel(){
    return model;
}
public int getYear(){
    return year;
}
public void setMake(String make){
this.make=make;
}
public void setModel(String model){
this.model=model;
}
public void setYear(int year){
this.year=year;
}
}


class Main{
    public static void main(String args[])
    {
        Car car = new Car("Ford","Mustang",2020);
        // System.out.println(car.getMake());
        // System.out.println(car.getYear());
        // System.out.println(car.getModel());
        car.setYear(2021);
        System.out.println(car.getMake());
        System.out.println(car.getYear());
        System.out.println(car.getModel());
    }
}