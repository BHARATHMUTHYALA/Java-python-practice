// class Arrays{
//     public static void main(String[] args){
//         String[] cars = {"Mustang", "Ferrari", "Lamborghini"};
//         cars[0] = "Hennesey";
//         System.out.println(cars[0]);
//     }
// }

class Arrays{
    public static void main(String[] args){
        String[] cars = new String[3];
        cars[0] = "Lamborghini";
        cars[1] = "Mustang";
        cars[2] = "Ferrari";
        for (String car : cars) {
            System.out.println(car);
        }
}
}