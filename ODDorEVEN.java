import java.util.Scanner;


class ODDorEVEN{
    public static void main(String args[]){
        int x;
        Scanner sc= new Scanner(System.in);
        x=sc.nextInt();
        if(x%2==0){
            System.out.print("It is even");
        }
        else{
            System.out.println("It is odd");
        }
        
          }
}