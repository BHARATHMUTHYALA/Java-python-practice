class Overload{
    public static void main(String args[]){

    
    double x = add(1.0,2.0,3.0);
    System.out.print(x);
    }
    static int add(int a, int b){
        System.out.println("This is overloaded method no 1");
        return a+b;
    }

    static int add(int a, int b, int c){
        System.out.println("This is overloaded method no 2");
        return a+b+c;
    }

    static int add(int a, int b, int c, int d){
        System.out.println("This is overloaded method no 3");
        return a+b+c+d;
    }

     static double add(double a, double b){
        System.out.println("This is overloaded method no 4");
        return a+b;
    }

    static double add(double a, double b, double c){
        System.out.println("This is overloaded method no 5");
        return a+b+c;
    }

    static double add(double a, double b, double c, double d){
        System.out.println("This is overloaded method no 6");
        return a+b+c+d;
    }
}