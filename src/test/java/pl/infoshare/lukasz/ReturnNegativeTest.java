package pl.infoshare.lukasz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReturnNegativeTest {

    @Test
    public void test1() {
        assertEquals(-42, ReturnNegative.makeNegative(42));
    }
}
