import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Animal animal;
        
        System.out.println("What animal do you want");
        System.out.println("1==dog and 2==cat");
        int choice = sc.nextInt();

        if(choice==1){
            animal = new Dog();
            animal.speak();
       }
       else if(choice==2){
        animal = new Cat();
        animal.speak();
        }
        else{
            animal = new Animal();
            System.out.println("Wrong choice");
            animal.speak();
        }
    }   
}

class Animal{
    public void speak(){
    System.out.println("The animal speaks");
}
}
class Dog extends Animal{
    public void speak(){
    System.out.println("Dog goes bark");
}
}
class Cat extends Animal{
        public void speak(){
            System.out.println("Cat goes meow");

        }

    }