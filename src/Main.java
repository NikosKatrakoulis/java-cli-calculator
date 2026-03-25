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

        while (isRunning) {

            String operator = "";
            while (true) {
                System.out.print("Enter the first number. Type 'exit' to quit. ");
                String firstNumberInput = scanner.nextLine().trim().toLowerCase();
                if (firstNumberInput.equals("exit")) {
                    isRunning = false;
                    break;
                }

                try {
                    firstNumber = Double.parseDouble(firstNumberInput);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    System.out.println();
                }
            }
            if (!isRunning){
                break;
            }


            while (true) {
                System.out.print("Enter an operator('+','-','*','/'). Type 'exit' to quit. ");
                String operatorInput = scanner.nextLine().trim().toLowerCase();
                if (operatorInput.equals("exit")) {
                    isRunning = false;
                    break;
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
            if (!isRunning){
                break;
            }

            while (true) {
                System.out.print("Enter the second number. Type 'exit' to quit. ");
                String secondNumberInput = scanner.nextLine().trim().toLowerCase();

                if (secondNumberInput.equals("exit")) {
                    isRunning = false;
                    break;
                }

                try {
                    secondNumber = Double.parseDouble(secondNumberInput);
                    if (operator.equals("/") && secondNumber == 0) {
                        System.out.println("Invalid input! Cannot divide by 0.");
                        System.out.println("Please enter another number.");
                        System.out.println();
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    System.out.println();
                }

            }
            if (!isRunning){
                break;
            }

            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    result = firstNumber / secondNumber;
                    break;
            }
            System.out.println("Result: " + result);

            while (true) {
                System.out.println("Do you want another calculation? (yes/no)");
                String answerInput = scanner.nextLine().trim().toLowerCase();

                if (answerInput.equals("yes")) {
                    break;
                } else if (answerInput.equals("no")) {
                    isRunning = false;
                    break;
                } else {
                    System.out.println("Invalid input! Please enter 'yes' or 'no'");
                }
            }
        }
        scanner.close();
    }
}