class TWOd{
    public static void main(String args[]){
        String[][] cars = {{"Camaro", "Corvette", "Mustang"},
                           {"Ferrari","Lambo","Tesla"},
                           {"Mazda","Bentley","Pagani"}
                          };

        for(int i=0; i<cars.length; i++){
            System.out.println();
            for(int j=0 ; j<cars[i].length;j++){
                System.out.print(cars[i][j]+ " ");
            }
        }
    }
}