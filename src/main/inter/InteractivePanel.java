package inter;

import note.Notepad;


import java.util.Scanner;

public class InteractivePanel {

        Notepad notepad = new Notepad();
        Scanner num = new Scanner(System.in);

    public void greeting () {
        System.out.println("Вас приветствует программка 'Мой блокнот'");
        System.out.println("Выберите и ведите команду, удовлетворяющую ващим требованиям:\n1 - добавление записи\n" +
                "2 - удаление записи\n3 - редактирование\n4 - вывод на экран\n5 - выход");

        int code = num.nextInt();

        switch (code){
            case 1:
                System.out.print("Введите свою строку: ");
                String str = num.next();
                notepad.add(str);
                greeting();
                break;

            case 2:
                System.out.println("Выберите запись для удаления:");
                notepad.showAll();
                int line = num.nextInt();
                notepad.delete(line);
                System.out.println("-----Записи успешно обновлены-----\n\n\n");
                greeting();
                break;

            case 3:
                System.out.println("Какую запись вы бы хотели отредактировать?\n");
                notepad.showAll();
                line = num.nextInt();
                System.out.println("Введите новую запись: ");
                str = num.next();
                notepad.edit(line,str);
                System.out.println("-----Записи успешно обновлены-----\n\n\n");
                notepad.showAll();
                greeting();
                break;

            case 4:
                notepad.showAll();
                greeting();
                break;

            case 5:
                break;

            default:
                System.out.println("Введите команду от 1 до 5");
                greeting();
                break;
        }

    }


}

