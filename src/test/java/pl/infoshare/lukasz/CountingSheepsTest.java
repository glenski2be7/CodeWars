package pl.infoshare.lukasz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CountingSheepsTest {
    Boolean[] array1 = {true,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  true };

    @Test
    public void test() {
        assertEquals("There are 17 sheeps in total", 17, new CountingSheeps().countSheeps(array1));
    }
}
