package note;


import validator.Validator;
import java.util.Arrays;


public class Notepad  {

       public Note[] note = new Note[1];


    public Notepad (){
            init();
    }

    private void init() {

            note[note.length-1] = new Note();

    }

    public void add(String str) {


            note[note.length - 1].note = str;
            note = Arrays.copyOf(note, note.length + 1);
            note[note.length - 1] = new Note();
            System.out.println("символ \"" + note[note.length - 2].note + "\" добавлен в блокнот");
            System.out.println("\n\n\n\n\n");

    }

    public void delete(int line) {

        Validator.index(line, note.length - 1);

        if(note.length <= 1){
            note = new Note[1];
            init();
            System.out.println("\n\n\nУпс, блокнот пуст\nПора в него что-нибудь добавить ;)\n\n\n");
        }
        else {
        Note[] newNote = new Note[note.length - 1];
        for (int currentLine = 0; currentLine < line; currentLine++) {
            newNote[currentLine] = note[currentLine];
        }
        for (int currentLine = line + 1; currentLine < note.length - 1; currentLine++) {
            newNote[currentLine - 1] = note[currentLine];
        }
        note = newNote;
        init();
        showAll();
        }

    }

    public void edit(int line, String str) {

        Validator.index(line, note.length - 1);
        note[line].note = str;
    }

    public void showAll () {
           if( Validator.empty(note)==1 ){}
           else {
               System.out.println("Мой блокнот: ");
               for (int noteIndex = 0; noteIndex < note.length - 1; noteIndex++) {
                   System.out.println(noteIndex + ": " + note[noteIndex].note);
               }
               System.out.println("\n\n\n");
           }
        }


    }

