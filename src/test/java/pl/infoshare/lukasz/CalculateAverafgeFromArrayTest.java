package pl.infoshare.lukasz;

import org.junit.Test;
import pl.infoshare.lukasz.sql.CalculateAverafgeFromArray;

import static org.junit.Assert.assertEquals;

public class CalculateAverafgeFromArrayTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testSomething() {
        assertEquals(1, CalculateAverafgeFromArray.find_average(new int[]{1, 1, 1}), DELTA);
        assertEquals(2, CalculateAverafgeFromArray.find_average(new int[]{1, 2, 3}), DELTA);
//        assertEquals(2, CalculateAverafgeFromArray.find_average(new int[]{1, 2}), DELTA);
    }
}
