import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*
            Функционал программы
    Запрос списка задач/дел у пользователя;
    Возможность добавить задачу в список;
    Возможность удалить задачу из списка;
    Возможность вывода всех задач.
     */
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        loop:                                               //метка
        while (true){
            System.out.println("Выберите действие:\n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "0. Выход");
            String inputNum = scanner.nextLine();
            switch (inputNum) {

                case "1":
                    String input = scanner.nextLine();
                    list.add(input);
                    break;

                case"2":
                    for (String s : list) {
                        System.out.println(s);
                    }
                    System.out.println();
                    break;

                case "3":

                    System.out.println("Введите номер удаляемого элемента: ");
                    int listIndex = scanner.nextInt();
                    list.remove(--listIndex);
                    break;

                case "0":
                    break loop;     // выходим из loop

                default:
                    System.out.println("Введите значение из списка! \n");
            }
        }
    }
}
