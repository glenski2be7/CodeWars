package pl.infoshare.lukasz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReturnNegativesTest {

    @Test
    public void test1() {
        assertEquals(-42, ReturnNegative.makeNegative(42));
    }
}
