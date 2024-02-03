import java.util.Scanner;

public class TaskOneAston {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = readInt(scanner, "Введите целое число \"a\":");
            int b = readInt(scanner, "Введите целое число \"b\":");
            System.out.println("Введите операцию для чисел \"a\" и \"b\" (+, -, / или *):");
            String operation = scanner.next();

            printComparison(a, b);
            performOperation(a, b, operation);
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }

    private static int readInt(Scanner scanner, String prompt) {
        System.out.println(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Это не число. Пожалуйста, введите целое число:");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void printComparison(int a, int b) {
        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " = " + b);
        }
    }

    private static void performOperation(int a, int b, String operation) {
        switch (operation) {
            case "+":
                System.out.println("Результат: " + (a + b));
                break;
            case "-":
                System.out.println("Результат: " + (a - b));
                break;
            case "*":
                System.out.println("Результат: " + (a * b));
                break;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Деление на ноль невозможно");
                } else {
                    System.out.println("Результат: " + ((double) a / b));
                }
                break;
            default:
                throw new IllegalStateException("Вы ввели недопустимую операцию: " + operation + ". Пожалуйста, введите одну из операций: +, -, * или /");
        }
    }
}
