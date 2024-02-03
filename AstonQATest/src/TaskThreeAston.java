import java.util.Scanner;

public class TaskThreeAston {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив целых чисел, разделенных пробелами:");

        String input = scanner.nextLine();
        String[] numbersStr = input.split(" ");
        System.out.println("Четные числа в массиве:");

        for (int i = 0; i < numbersStr.length; i++) {
            String numStr = numbersStr[i];
            try {
                int num = Integer.parseInt(numStr);
                if (num % 2 == 0) {
                    System.out.println(num);
                }
            } catch (NumberFormatException e) {
                System.out.println("Введен некорректный элемент \"" + numStr + "\". Пропускаем...");
            }
        }
    }
}