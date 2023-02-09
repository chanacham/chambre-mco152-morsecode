package Chambre.MorseCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeTest {
    @Test
    public void toMorseCode(){
        MorseCode interpreter = new MorseCode();
        assertEquals("**** * *-** *-** ---", interpreter.toMorseCode("hello"));
        assertEquals("-*-* **** *- -* *-" , interpreter.toMorseCode("chana"));
        assertEquals("*--* *-* --- --* *-* *- --", interpreter.toMorseCode("program"));
    }

    @Test
    public void toMessage(){
        MorseCode interpreter = new MorseCode();
        assertEquals("hello", interpreter.toMessage("**** * *-** *-** ---"));
        assertEquals("chana", interpreter.toMessage("-*-* **** *- -* *-"));
        assertEquals("program", interpreter.toMessage("*--* *-* --- --* *-* *- --"));
    }

}