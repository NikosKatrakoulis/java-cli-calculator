import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String WELCOME_MESSAGE = """
                =============== CLI CALCULATOR ===============
                
                      Welcome to my CLI calculator
                
                      Choose an operation from the menu,
                      enter two numbers and get a result.
                """;

        System.out.println(WELCOME_MESSAGE);
        System.out.println();

        boolean isRunning = true;
        double result = 0;
        double firstNumber = 0, secondNumber = 0;
        String operator;

        while (isRunning) {
            while (true) {
                System.out.println("Enter the first number. Type 'exit' to exit.");
                String firstNumberInput = scanner.nextLine().trim().toLowerCase();
                if (firstNumberInput.equals("exit")) {
                    isRunning = false;
                }

                try {
                    firstNumber = Double.parseDouble(firstNumberInput);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    System.out.println();
                }
            }

            while (true) {
                System.out.println("Enter an operator('+','-','*','/')");
                String operatorInput = scanner.nextLine().trim().toLowerCase();
                if (operatorInput.equals("exit")) {
                    isRunning = false;
                }

                if (operatorInput.equals("+")) {
                    operator = operatorInput;
                    break;
                } else if (operatorInput.equals("-")) {
                    operator = operatorInput;
                    break;
                } else if (operatorInput.equals("*")) {
                    operator = operatorInput;
                    break;
                } else if (operatorInput.equals("/")) {
                    operator = operatorInput;
                    break;
                } else {
                    System.out.println("Invalid operator! Please enter one of these ('+','-','*','/').");
                }

            }

            while (true) {
                System.out.println("Enter the second number. Type 'exit' to exit.");
                String secondNumberInput = scanner.nextLine().trim().toLowerCase();

                if (secondNumberInput.equals("exit")) {
                    isRunning = false;
                }

                try {
                    secondNumber = Double.parseDouble(secondNumberInput);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    System.out.println();
                }

            }

            
            }
        }
        scanner.close();
    }
}