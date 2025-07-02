class Main{
    public static void main(String args[]){
        // System.out.printf("This is a format string %d", 123);
        boolean MyBool = true;
        char Mychar = '@';
        String MyString = "BRO";
        int MyInt = 50;
        double MyDouble = 1000;

        // System.out.printf("%b", MyBool);
        // System.out.printf("%c", Mychar);
        // System.out.printf("Hello %-10s", MyString);
        System.out.printf("You have this much money%,f", MyDouble);
    }
}