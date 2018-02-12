package inter;

import note.Notepad;

import java.util.Scanner;

public class InteractivePanel {

    public static void greeting () {
        System.out.println("Вас приветствует программка 'Мой блокнот'");
        System.out.println("Выберите и ведите команду, удовлетворяющую ващим требованиям:\n1 - добавление записи\n" +
                "2 - удаление записи\n3 - редактирование\n4 - вывод на экран\n5 - выход");
        Scanner num = new Scanner(System.in);
        int code = num.nextInt();
        Notepad.logic( code );

    }


}
