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
        double result;
        double firstNumber = 0, secondNumber = 0;

        while (isRunning) {
            System.out.println();
            System.out.println("================ MENU ===============");
            System.out.println("        1. Addition");
            System.out.println("        2. Subtraction");
            System.out.println("        3. Multiplication");
            System.out.println("        4. Division");
            System.out.println("        5. Exit");
            System.out.println("        Select an option:");
            String inputOption = scanner.nextLine().trim().toLowerCase();

            int menuOption;
            try {
                menuOption = Integer.parseInt(inputOption);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number between 1 and 5.");
                continue;
            }
            if (menuOption < 1 || menuOption > 5) {
                System.out.println("Invalid menu option! Please enter a number between 1 and 5.");
                continue;
            }

            boolean shouldReturnToMenu = false;

            if (menuOption == 1) {
                while (true) {
                    System.out.println("Enter the first number. Type 'exit' to return to menu.");
                    String firstNumberInput = scanner.nextLine().trim().toLowerCase();
                    if (firstNumberInput.equals("exit")) {
                        System.out.println("\nReturning to main menu...");
                        shouldReturnToMenu = true;
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
                if (shouldReturnToMenu) {
                    continue;
                }

                while (true) {
                    System.out.println("Enter the second number. Type 'exit' to return to menu.");
                    String secondNumberInput = scanner.nextLine().trim().toLowerCase();
                    if (secondNumberInput.equals("exit")) {
                        System.out.println("\nReturning to main menu...");
                        shouldReturnToMenu = true;
                        break;
                    }
                    try {
                        secondNumber = Double.parseDouble(secondNumberInput);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input! Please enter a valid number.");
                        System.out.println();
                    }
                }

                if (shouldReturnToMenu) {
                    continue;
                }

                result = firstNumber + secondNumber;
                System.out.println("--------------- RESULT ---------------");
                System.out.println("Result: " + result);
                System.out.println();

            } else if (menuOption == 2) {
                while (true) {
                    System.out.println("Enter the first number. Type 'exit' to return to menu.");
                    String firstNumberInput = scanner.nextLine().trim().toLowerCase();
                    if (firstNumberInput.equals("exit")) {
                        System.out.println("\nReturning to main menu...");
                        shouldReturnToMenu = true;
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

                if (shouldReturnToMenu) {
                    continue;
                }

                while (true) {
                    System.out.println("Enter the second number. Type 'exit' to return to menu.");
                    String secondNumberInput = scanner.nextLine().trim().toLowerCase();
                    if (secondNumberInput.equals("exit")) {
                        System.out.println("\nReturning to main menu...");
                        shouldReturnToMenu = true;
                        break;
                    }

                    try {
                        secondNumber = Double.parseDouble(secondNumberInput);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input! Please enter a valid number.");
                        System.out.println();
                    }
                }

                if (shouldReturnToMenu) {
                    continue;
                }

                result = firstNumber - secondNumber;
                System.out.println("--------------- RESULT ---------------");
                System.out.println("Result: " + result);
                System.out.println();

            } else if (menuOption == 3) {
                while (true) {
                    System.out.println("Enter the first number. Type 'exit' to return to menu.");
                    String firstNumberInput = scanner.nextLine().trim().toLowerCase();
                    if (firstNumberInput.equals("exit")) {
                        System.out.println("\nReturning to main menu...");
                        shouldReturnToMenu = true;
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

                if (shouldReturnToMenu) {
                    continue;
                }

                while (true) {
                    System.out.println("Enter the second number. Type 'exit' to return to menu.");
                    String secondNumberInput = scanner.nextLine().trim().toLowerCase();
                    if (secondNumberInput.equals("exit")) {
                        System.out.println("\nReturning to main menu...");
                        shouldReturnToMenu = true;
                        break;
                    }

                    try {
                        secondNumber = Double.parseDouble(secondNumberInput);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input! Please enter a valid number.");
                        System.out.println();
                    }
                }
                if (shouldReturnToMenu) {
                    continue;
                }

                result = firstNumber * secondNumber;
                System.out.println("--------------- RESULT ---------------");
                System.out.println("Result: " + result);
                System.out.println();

            } else if (menuOption == 4) {

                while (true) {
                    System.out.println("Enter the first number. Type 'exit' to return to menu.");
                    String firstNumberInput = scanner.nextLine().trim().toLowerCase();
                    if (firstNumberInput.equals("exit")) {
                        System.out.println("\nReturning to main menu...");
                        shouldReturnToMenu = true;
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

                if (shouldReturnToMenu) {
                    continue;
                }

                while (true) {
                    System.out.println("Enter the second number. Type 'exit' to return to menu.");
                    String secondNumberInput = scanner.nextLine().trim().toLowerCase();
                    if (secondNumberInput.equals("exit")) {
                        System.out.println("\nReturning to main menu...");
                        shouldReturnToMenu = true;
                        break;
                    }

                    try {
                        secondNumber = Double.parseDouble(secondNumberInput);
                        if (secondNumber == 0) {
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

                if (shouldReturnToMenu) {
                    continue;
                }

                result = firstNumber / secondNumber;
                System.out.println("--------------- RESULT ---------------");
                System.out.println("Result: " + result);
                System.out.println();

            } else if (menuOption == 5) {
                System.out.println("\n==============================");
                System.out.println("Thank you for using the calculator.");
                System.out.println("Goodbye!");
                System.out.println();
                isRunning = false;
            }
        }
        scanner.close();
    }
}