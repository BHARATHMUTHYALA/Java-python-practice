class Super{
    public static void main(String args[]){
    Hero hero1 = new Hero("Batman", 18, "Rich");
    Hero hero2 = new Hero("Superman", 99, "Everything");
    System.out.println(hero1.age);
    System.out.println(hero1.power);
    System.out.println(hero2.toString() );

    }
}
class Person{
    String name;
    int age;
    Person(String name, int age){
    this.name=name;
    this.age=age;
    }
    public String toString(){
        return this.name + "\n" + this.age +"\n";
    }
}
class Hero extends Person{
    String power;
    Hero(String name, int age, String power){
        super(name,age);
        this.power=power;
    }
    public String toString(){
        return super.toString()+this.power;
    }
    
}