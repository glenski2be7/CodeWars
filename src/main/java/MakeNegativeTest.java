import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeNegativeTest {

    @Test
    public void test1() {
        assertEquals(-42, ReturnNegative.makeNegative(42));
    }
}
