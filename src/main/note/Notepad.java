package note;


import test.Validator;
import java.util.Arrays;


public class Notepad  {
    private int counter;
    final private int val;
    {
        counter = 0;
        val = 5;
    }

    private Note[] note;



    public Notepad (){
        note = new Note[val];
        init();
    }

    public Note[] getNote(){
        return note;
    }

    private void init() {

           for (int currentLine = 0;  currentLine < note.length-1  ; currentLine++) {
               note[currentLine] = new Note();
           }
    }

    public void add(String str) {

        note[counter].setNote(str);
        if( note.length/(counter+1) < 1.5 ) {
            note = Arrays.copyOf(note, note.length * 2);
        }
        counter++;
        note[counter] = new Note();
            System.out.println("символ \"" + note[counter-1].getNote() + "\" добавлен в блокнот");
            System.out.println("\n\n\n\n\n");

    }

    public void delete(int line) {

        Validator.index(line, note.length - 1);
        counter--;
        if(counter <= 0){
            note = new Note[val];
            init();
            System.out.println("\n\n\nУпс, блокнот пуст\nПора в него что-нибудь добавить ;)\n\n\n");
        } else {
            if ( note.length/(counter+1) > 3 ){
                note = Arrays.copyOf(note, note.length / 2);
            }


        for (int currentLine = line + 1; currentLine <= counter; currentLine++) {
            note[currentLine - 1] = note[currentLine];
        }
        note[counter] = new Note();
        showAll();
        }

    }

    public void edit(int line, String str) {

        Validator.index(line, note.length - 1);
        note[line].setNote(str);
    }

    public void showAll () {
        if( Validator.empty(note)!=1 ){

            System.out.println("Мой блокнот: ");
            for (int noteIndex = 0; noteIndex < counter; noteIndex++) {
                System.out.println(noteIndex + ": " + note[noteIndex].getNote());
            }
            System.out.println("\n\n\n");
            }
        }


    }

