package day01trebuchet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalibrationDecoderTest
{
    CalibrationDecoder decoder;

    @BeforeEach
    void setUp() {
        decoder = new CalibrationDecoder();
    }

    @Test
    void testInput() throws Exception {
        assertEquals(12, decoder.decode(new String[] {"1abc2"}));
    }

    @Test
    void testExampleInput() throws Exception {
        assertEquals(142, decoder.decode(new String[] {"1abc2", "pqr3stu8vwx", "a1b2c3d4e5f", "treb7uchet"}));
    }
}