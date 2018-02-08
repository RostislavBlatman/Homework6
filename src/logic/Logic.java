package logic;

import test.Test;

import java.util.Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Logic {
    String[] note = new String[1];
    public void logic (){
        System.out.println("Вас приветствует програмка 'Мой блокнот'");
        System.out.println("Выберите и ведите команду, удовлетворяющую ващим требованиям:\n1 - добавление записи\n" +
                "2 - удаление записи\n3 - редактирование\n4 - вывод на экран\n5 - выход");
        Scanner num = new Scanner(System.in);
        int com = num.nextInt();
        switch (com){
            case 1:
                System.out.print("Введите свою строку: ");
                String str =  num.next();
                note[note.length -1] = str ;
                note = Arrays.copyOf(note , note.length+1);
                System.out.println("символ " + note[note.length -2] + " добавлен в блокнот");
                System.out.println ("\n\n\n\n\n");
                logic();
            case 2:
                String [] noteNew = new String[note.length-1] ;
                System.out.println ("Выберите удаляемую запись и введите её номер ");
                for (int i = 0; i < note.length-1; i++) {
                    System.out.println (i + ": " + note[i]);
                }
                int kod = num.nextInt();
                Test.index( kod, note.length-1 );
                for (int k = 0 ; k < kod ; k++){
                    noteNew[k] = note[k];
                }
                for (int k = kod+1 ; k < note.length-1; k++ ){
                    noteNew[k-1] = note[k];
                }
                note = noteNew ;
                System.out.println ("Записи обновлены: ");
                for (int i = 0; i < note.length-1; i++) {
                    System.out.println (i + ": " + note[i]);
                }
                System.out.println ("\n");
                logic();
            case 3:
                System.out.println("Какую запись вы бы хотели отредактировать?\n");
                for (int i = 0; i < note.length-1; i++) {
                    System.out.println (i + ": " + note[i]);
                }
                kod = num.nextInt();
                Test.index( kod, note.length-1 );
                System.out.println("Введите новую запись: ");
                str = num.next();
                note[kod] = str ;
                System.out.println ("Записи обновлены: ");
                for (int i = 0; i < note.length-1; i++) {
                    System.out.println (i + ": " + note[i]);
                }
                System.out.println ("\n");
                logic();
            case 4:
                Test.pust( note );
                System.out.println ("Мой блокнот: ");
                for (int i = 0; i < note.length-1; i++) {
                    System.out.println (i + ": " + note[i]);
                }
                System.out.println ("\n");
                logic();
            case 5:
                break;

        }

        }


}
