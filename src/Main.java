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
        double firstNumber = 0, secondNumber = 0;

        while (isRunning) {
            System.out.println("================ MENU ===============");
            System.out.println("        1. Addition");
            System.out.println("        2. Subtraction");
            System.out.println("        3. Multiply");
            System.out.println("        4. Division");
            System.out.println("        5. Exit");
            System.out.println("        Choose one:");
            String inputOption = scanner.nextLine().trim().toLowerCase();

            int menuOption = 0;
            try {
                menuOption = Integer.parseInt(inputOption);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number between 1 to 5.");
                continue;
            }
            if (menuOption < 1 || menuOption > 5 ) {
                System.out.println("Invalid menu option! Please enter a number between 1 to 5.");
                continue;
            }

            boolean shouldReturnToMenu = false;

            if (menuOption == 1) {


                while (true) {
                    System.out.println("Enter the first number. Type 'exit' to return to menu.");
                    String cleanInput1 = scanner.nextLine().trim().toLowerCase();
                    if (cleanInput1.equals("exit")) {
                        shouldReturnToMenu = true;
                        break;
                    }

                    try {
                        firstNumber = Double.parseDouble(cleanInput1);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input! Please enter a number.");
                    }
                }
                if (shouldReturnToMenu) {
                    continue;
                }

                while (true) {
                    System.out.println("Enter the second number. Type 'exit' to return to menu.");
                    String cleanInput2 = scanner.nextLine().trim().toLowerCase();
                    if (cleanInput2.equals("exit")) {
                        shouldReturnToMenu = true;
                        break;
                    }
                    try {
                        secondNumber = Double.parseDouble(cleanInput2);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input! Please enter a number.");
                    }
                }


                if (shouldReturnToMenu) {
                    continue;
                }
            }

            if (menuOption == 2) {

                while (true){
                    System.out.println("Enter the first number. Type 'exit' to return to menu.");
                    String cleanInput1 = scanner.nextLine().trim().toLowerCase();
                    if (cleanInput1.equals("exit")){
                        shouldReturnToMenu = true;
                        break;
                    }

                    try {
                        firstNumber = Double.parseDouble(cleanInput1);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input! Please enter a number.");
                    }

                }

                if (shouldReturnToMenu) {
                    continue;
                }

                while (true) {
                    System.out.println("Enter the second number. Type 'exit' to return to menu.");
                    String cleanInput2 = scanner.nextLine().trim().toLowerCase();
                    if (cleanInput2.equals("exit")){
                        shouldReturnToMenu = true;
                        break;
                    }

                    try {
                        secondNumber = Double.parseDouble(cleanInput2);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input! Please enter a number.");
                    }
                }


                if (shouldReturnToMenu) {
                    continue;
                }
            }

            if (menuOption == 3) {

                while (true) {
                    System.out.println("Enter the first number. Type 'exit' to return to menu.");
                    String cleanInput1 = scanner.nextLine().trim().toLowerCase();
                    if (cleanInput1.equals("exit")) {
                        shouldReturnToMenu = true;
                        break;
                    }

                    try {
                        firstNumber = Double.parseDouble(cleanInput1);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input! Please enter a number.");
                    }
                }

                if (shouldReturnToMenu){
                    continue;
                }
            }

            if (menuOption == 4) {

                while (true) {
                    System.out.println("Enter the first number. ");
                }
            }

            System.out.println("Result: " + result);
        }
    }
}