import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringConverterTest {

    @Test
    public void should_return_integer_value(){
        String input = "1";
        Integer result = StringConverter.convert(input);
        assertEquals(new Integer(1) , result);
    }
    @Test
    public void should_throw_illegal_argument_exception_when_contains_chars(){
        String input ="a1";
        assertThrows(IllegalArgumentException.class , ()->StringConverter.convert(input));
    }
    @Test
    public void should_be_in_range(){
        String input="32768";
        assertThrows(IllegalArgumentException.class , ()->StringConverter.convert(input));
        String input2="-32768";
        assertThrows(IllegalArgumentException.class , ()->StringConverter.convert(input2));
    }

}