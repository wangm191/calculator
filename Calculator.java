public class Calculator{
    
    public static double add(double a, double b){
        return a + b; 
    }

    public static double subtract(double a, double b){
        return a - b; 
    }

    public static double multiply(double a, double b){
        return a * b; 
    }

    public static double divide(double a, double b){
        if (a == 0 || b == 0){
            System.out.println("Error, cannot divide by 0");
            return -1; 
        }
        else{
            return a / b; 
        }

    }


}