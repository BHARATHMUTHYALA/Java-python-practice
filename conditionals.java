import java.util.Scanner;
class Conditionals{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("YOU Can watch bits");
        }
        else{
            System.out.println("wait for a few years");
        }
    }
}