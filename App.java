import java.util.Scanner;


public class App{
    static final Scanner inputScanner = new Scanner(System.in);

    private static String getString(String prompt){
        System.out.println(prompt);
        String operatorInput = inputScanner.nextLine();
        return operatorInput;    
    }

    private static double getDouble(String prompt){
        System.out.println(prompt);
        Double numInput = inputScanner.nextDouble();
        String operatorInput = inputScanner.nextLine();
        return numInput;
    }

    public static void main(String[] args){
        Boolean calculatorOn = true;


        while (calculatorOn){

            String sPrompt = "Please enter an operation: addition, subtraction, multiplication, division";
            String dPrompt = "Please enter a number: ";
            //String restartPrompt = "Would you like to continue? Yes or No?";

            String operator = getString(sPrompt);

            
            double num1 = getDouble(dPrompt);
            double num2 = getDouble(dPrompt);
            //System.out.printf("You want to %s %.2f and %.2f %n", operator, num1, num2);

            double sum = 0;
            Calculator calculator = new Calculator();

            if (operator.equalsIgnoreCase("addition")){
                sum = calculator.add(num1, num2);
                System.out.printf("The %s of the two numbers is: %.2f %n", operator, sum);
            }
            if (operator.equalsIgnoreCase("subtraction")){
                sum = calculator.subtract(num1, num2);
                System.out.printf("The %s of the two numbers is: %.2f %n", operator, sum);
            }
            if (operator.equalsIgnoreCase("multiplication")){
                sum = calculator.multiply(num1, num2);
                System.out.printf("The %s of the two numbers is: %.2f %n", operator, sum);
            }
            if (operator.equalsIgnoreCase("division")){
                sum = calculator.divide(num1, num2);
                System.out.printf("The %s of the two numbers is: %.2f %n", operator, sum);
            }
            else{
                throw new UnsupportedOperationException("Invalid operator");
            }

            String restart = getString("Would you want to continue?");
                if (restart.equalsIgnoreCase("Yes")){
                calculatorOn = true;
            }
                else{
                System.out.println("Goodbye");
                calculatorOn = false;
            }
            
        }
    }
}