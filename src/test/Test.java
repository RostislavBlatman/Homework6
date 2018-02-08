package test;

import logic.Logic;

public class Test {
    public static void index (int i, int k) {
        if (i > k || i < 0) {
            throw new IndexOutOfBoundsException ("введён некорректный номер");
        }
    }
        public static void pust ( String[] note ) {
            if (note[0] == null) {
                System.out.println("\n\n\nУпс, блокнот пуст\nПора в него что-нибудь добавить ;)\n\n\n");
                Logic x = new Logic();
                x.logic();
            }
        }

    }

