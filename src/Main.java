import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String welcome_message = """
                =============== CLI CALCULATOR ===============
                
                      **Welcome to my CLI calculator**
                
                      Give the numbers and the operators
                      and the calculator will show the 
                                results.""";

        System.out.println(welcome_message);
        System.out.println();

        boolean isRunning = true;
        double result = 0;

        while (isRunning) {
            System.out.println("================ MENU ===============");
            System.out.println("        1. Addition");
            System.out.println("        2. Subtraction");
            System.out.println("        3. Multiply");
            System.out.println("        4. Division");
            System.out.println("        5. Exit");
            System.out.println("        Choose one:");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.println("Enter the first number. Type 'exit' anytime you want to quit:");
                double firstNumber = scanner.nextDouble();

                System.out.println("Enter the first number. Type 'exit' anytime you want to quit:");
                double secondNumber = scanner.nextDouble();

                result = firstNumber + secondNumber;
                System.out.println(result);

            } else if (option == 2) {
                System.out.println("Enter the first number. Type 'exit' anytime you want to quit:");
                double firstNumber = scanner.nextDouble();

                System.out.println("Enter the first number. Type 'exit' anytime you want to quit:");
                double secondNumber = scanner.nextDouble();

                result = firstNumber - secondNumber;
                System.out.println(result);
            } else if (option == 3) {
                System.out.println("Enter the first number. Type 'exit' anytime you want to quit:");
                double firstNumber = scanner.nextDouble();

                System.out.println("Enter the first number. Type 'exit' anytime you want to quit:");
                double secondNumber = scanner.nextDouble();

                result = firstNumber * secondNumber;
                System.out.println(result);
            } else if (option == 4) {
                System.out.println("Enter the first number. Type 'exit' anytime you want to quit:");
                double firstNumber = scanner.nextDouble();

                System.out.println("Enter the first number. Type 'exit' anytime you want to quit:");
                double secondNumber = scanner.nextDouble();

                if (secondNumber == 0) {
                    System.out.println("Invalid input. You can not divide with 0.");
                    continue;
                } else
                    result = firstNumber / secondNumber;
                System.out.println(result);

            } else if (option == 5) {
                System.out.println(result);
                System.out.println("Thank you for using the calculator. See you soon. :-)");
                isRunning = false;
            } else
                System.out.println("Invalid input! Please enter a number between 1 to 5.");


        }
    }
}
