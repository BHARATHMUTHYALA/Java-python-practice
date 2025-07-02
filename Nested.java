import java.util.Scanner;

public class Nested{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int rows, columns;
        String symbol = "";
        System.out.println("Enter number of rows");
        rows = sc.nextInt();
        System.out.println("Enter number of columns");
        columns=sc.nextInt();
        System.out.println("Enter symbol");
        symbol = sc.next();

        for(int i=1; i<=rows; i++){
            System.out.println();
            for(int j=1; j<=columns; j++){
                    System.out.print(symbol);
            }
        }

            }

}