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
        boolean isOperationRunning = true;
        double result = 0;
        double firstNumber = 0, secondNumber = 0;

        while (isRunning) {
            System.out.println("================ MENU ===============");
            System.out.println("        1. Addition");
            System.out.println("        2. Subtraction");
            System.out.println("        3. Multiply");
            System.out.println("        4. Division");
            System.out.println("        5. Exit");
            System.out.println("        Choose one:");
            int option = scanner.nextInt();
            scanner.nextLine();

            while (isOperationRunning) {
                if (option == 1) {
                    System.out.println("Enter the first number. Type 'exit' anytime you want to quit:");
                    String inputChoice1 = scanner.nextLine();
                    String cleanInput1 = inputChoice1.trim();
                    cleanInput1 = cleanInput1.toLowerCase();

                    if (cleanInput1.equals("exit")) {
                        isOperationRunning = false;
                    } else {
                        firstNumber = Double.parseDouble(cleanInput1);
                    }


                    System.out.println("Enter the second number. Type 'exit' anytime you want to quit:");
                    String inputChoice2 = scanner.nextLine();
                    String cleanInput2 = inputChoice2.trim();
                    cleanInput2 = cleanInput2.toLowerCase();
                    if (cleanInput2.equals("exit")) {
                        isOperationRunning = false;

                    } else {
                        secondNumber = Double.parseDouble(cleanInput2);
                    }
                    result = firstNumber + secondNumber;
                    System.out.println(result);
                }
            }
        }
    }
}