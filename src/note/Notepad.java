package note;

import inter.InteractivePanel;
import validator.Validator;
import java.util.Arrays;
import java.util.Scanner;

public class Notepad {

        static Note note = new Note();
        static String[] myNote = note.note;

        public static void logic (int code) {
            Scanner num = new Scanner(System.in);
            switch (code){
                case 1:

                    System.out.print("Введите свою строку: ");
                    String str =  num.next();
                    myNote[myNote.length -1] = str ;
                    myNote = Arrays.copyOf(myNote , myNote.length+1);
                    System.out.println("символ " + myNote[myNote.length -2] + " добавлен в блокнот");
                    System.out.println ("\n\n\n\n\n");
                    InteractivePanel.greeting();
                    break;
                case 2:
                    String [] noteNew = new String[myNote.length-1] ;
                    System.out.println ("Выберите удаляемую запись и введите её номер ");
                    for (int noteIndex = 0; noteIndex < myNote.length-1; noteIndex++) {
                        System.out.println (noteIndex + ": " + myNote[noteIndex]);
                    }
                    int line = num.nextInt();
                    Validator.index( line, myNote.length-1 );

                    for (int currentLine = 0 ; currentLine < line ; currentLine++){
                        noteNew[currentLine] = myNote[currentLine];
                    }
                    for (int currentLine = line+1 ; currentLine < myNote.length-1; currentLine++ ){
                        noteNew[currentLine-1] = myNote[currentLine];
                    }
                    myNote = noteNew ;
                    System.out.println ("Записи обновлены: ");
                    for (int noteIndex = 0; noteIndex < myNote.length-1; noteIndex++) {
                        System.out.println (noteIndex + ": " + myNote[noteIndex]);
                    }
                    System.out.println ("\n");
                    InteractivePanel.greeting();
                    break;
                case 3:
                    System.out.println("Какую запись вы бы хотели отредактировать?\n");
                    for (int noteIndex = 0; noteIndex < myNote.length-1; noteIndex++) {
                        System.out.println (noteIndex + ": " + myNote[noteIndex]);
                    }
                    line = num.nextInt();
                    Validator.index( line, myNote.length-1 );
                    System.out.println("Введите новую запись: ");
                    str = num.next();
                    myNote[line] = str ;
                    System.out.println ("Записи обновлены: ");
                    for (int noteIndex = 0; noteIndex < myNote.length-1; noteIndex++) {
                        System.out.println (noteIndex + ": " + myNote[noteIndex]);
                    }
                    System.out.println ("\n");
                    InteractivePanel.greeting();
                    break;
                case 4:
                    Validator.empty( myNote );
                    System.out.println ("Мой блокнот: ");
                    for (int noteIndex = 0; noteIndex < myNote.length-1; noteIndex++) {
                        System.out.println (noteIndex + ": " + myNote[noteIndex]);
                    }
                    System.out.println ("\n");
                    InteractivePanel.greeting();
                    break;
                case 5:
                    break;


            }

        }


}
