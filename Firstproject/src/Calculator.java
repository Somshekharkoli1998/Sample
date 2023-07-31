public class Calculator {
    public  double addition(double a, double b){
        return a+b;
    }
    public double subtraction(double a, double b){
        return a-b;
    }
    public double multiplication(double a, double b){
        return a*b;
    }
    public float division(int a, int b){
        return a/b ;
    }

    public static void main(String[] args) {
        Calculator cal =new Calculator();
        double add = cal.addition(10,5);
        System.out.println("addition is:"+add);

        double sub = cal.subtraction(10,5);
        System.out.println("subtraction is:"+sub);

        double multi = cal.multiplication(10,5);
        System.out.println("multiplication is:"+multi);

        float div = cal.division(10,5);
        System.out.println("division is:"+div);
    }
}
