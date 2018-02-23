package validator;

import note.Note;

public class Validator {
    public static void index (int currentIndex, int maxIndex) {
        if (currentIndex > maxIndex || currentIndex < 0) {
            throw new IndexOutOfBoundsException ("введён некорректный номер");
        }
    }
    public static int empty ( Note[] note ) {

        if (note[0].getNote() == null || note.length == 1) {

            System.out.println("\n\n\nУпс, блокнот пуст\nПора в него что-нибудь добавить ;)\n\n\n");

            return 1;
        }
        return 0;

    }


    }

