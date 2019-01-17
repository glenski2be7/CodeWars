package java.pl.infoshare.lukasz;

import org.junit.Test;
import pl.infoshare.lukasz.ReturnNegative;

import static org.junit.Assert.assertEquals;

public class MakeNegativeTest {

    @Test
    public void test1() {
        assertEquals(-42, ReturnNegative.makeNegative(42));
    }
}
