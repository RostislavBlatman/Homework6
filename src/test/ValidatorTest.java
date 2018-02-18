package test;

import note.Note;

import org.junit.Test;
import validator.Validator;

import static org.junit.Assert.*;

public class ValidatorTest {
    @Test
    public void validatorForEmptyNoteShouldReturn1(){
        Note[] note = new Note[1];
        note[note.length-1] = new Note();
        int a = Validator.empty(note);
        assertEquals(1, a);
    }

}