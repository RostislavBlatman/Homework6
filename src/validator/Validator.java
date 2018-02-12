package validator;

import inter.InteractivePanel;

public class Validator {
    public static void index (int i, int k) {
        if (i > k || i < 0) {
            throw new IndexOutOfBoundsException ("введён некорректный номер");
        }
    }
        public static void empty ( String[] note ) {
            if (note[0] == null) {
                System.out.println("\n\n\nУпс, блокнот пуст\nПора в него что-нибудь добавить ;)\n\n\n");
                InteractivePanel x = new InteractivePanel();
                x.greeting();

            }
        }

    }

