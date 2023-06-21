import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> purchases = new ArrayList<>();

        while (true) {
            System.out.println("Выберете операцию или введите end для завершения работы: \n1. Добавить \n2. Показать \n3. Удалить \n");
            String operation = scanner.nextLine();
            if ("end".equals(operation)) {
                System.out.println("Работа завершена!");
                break;
            }

            switch (operation) {
                case "1": {
                    System.out.println("Какую покупку хотите добавить?");
                    purchases.add(scanner.nextLine());
                    break;
                }
                case "2": {
                    System.out.println("Список покупок:");
                    for (int i = 0; i < purchases.size(); i++) {
                        int count = i + 1;
                        System.out.println(count + ". " + purchases.get(i));
                    }
                    break;
                }
                case "3": {
                    System.out.println("Введите номер или название покупки, которую хотите удалить.");
                    String nameOrNumber = scanner.nextLine();
                    try {
                        int index = Integer.parseInt(nameOrNumber) - 1;
                        purchases.remove(index);
                    } catch (Exception e) {
                        purchases.remove(nameOrNumber);
                    }
                    break;
                }
                default: {
                    System.out.println("Некорректное действие");
                }
            }
        }
    }
}
