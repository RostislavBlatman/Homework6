package test;


import note.Note;
import note.Notepad;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NotepadTest {
    private Notepad notepad;


    @Before
    public void setUp() {
        notepad = new Notepad();

    }

    @Test
    public void addTest() {
        notepad.add("String");
        assertEquals("String", notepad.getNote()[notepad.getNote().length - 5].getNote());
    }

    @Test
    public void deleteTest() {
        notepad.add("String");
        notepad.add("Thing");
        notepad.delete(1);
        assertEquals("String", notepad.getNote()[notepad.getNote().length - 5].getNote());
    }

    @Test
    public void deleteForEmptyNotepad() {

        Note[] testObj = new Note[1];
        testObj[0] = new Note();
        notepad.delete(0);
        assertTrue(notepad.getNote()[0].getClass() == testObj[0].getClass());
    }

    @Test
    public void editNotepadTest() {
        notepad.edit(0, "String");
        assertEquals(notepad.getNote()[0].getNote(), "String");
    }
}