import java.util.Scanner;

class Or{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
       String response = sc.next();

       if (response.equals("q") || response.equals("Q")){
        System.out.println("It is q");
       }
    }
}