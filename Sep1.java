import java.util.Scanner;
public class Sep1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name= "";
       do{
            System.out.print("Enter your name: ");
            name=sc.nextLine();

    
        } while(name.isBlank());
        System.out.print("Hello " +name);
    }

}