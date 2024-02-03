import java.util.Scanner;

public class TaskTwoAston {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        System.out.println("Введите строку №1 для сравнения:");
        String firstString = src.nextLine();

        System.out.println("Введите строку №2 для сравнения:");
        String secondString = src.nextLine();

        System.out.println("При сравнении двух строк будет учитываться регистр? " +
                "Введите \"да\" или \"нет\".");
        String choose = src.nextLine();
        choiceMethod(choose, firstString, secondString);
        src.close();
    }

    public static void compareString(String a, String b) {
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }


    public static void compareStringIgnoreCase(String a, String b) {
        if (a.equalsIgnoreCase(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }

    public static void choiceMethod(String choice, String firstString, String secondString) {
        switch (choice) {
            case "да":
                compareString(firstString, secondString);
                break;
            case "нет":
                compareStringIgnoreCase(firstString, secondString);
                break;
            default:
                System.out.println("Ошибка, необходимо ввести \"да\" или \"нет\". " +
                        "Запустите программу повторно.");

        }

    }
}
