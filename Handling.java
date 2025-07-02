import java.util.Scanner;
import java.util.InputMismatchException;
class Main{
    public static void main(String args[]){

        try{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number for division");
        int a = sc.nextInt();

        System.out.println("Enter another number for division");
        int b = sc.nextInt();

        int  c = a/b;
        System.out.println("The result is "+c);
    }
    catch(ArithmeticException e){
        System.out.println("You can't divide by zero!!!!!!!!!");
    
    }
    catch(InputMismatchException e){
        System.out.println("Cannot be divided by alphabets");
    }
    catch(Exception e){
        System.out.println(e);
    }
    finally{
        System.out.println("I am inevitable");
    }
    }
}