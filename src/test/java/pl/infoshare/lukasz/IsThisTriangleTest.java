package pl.infoshare.lukasz;
import static org.junit.Assert.*;
import org.junit.Test;


public class IsThisTriangleTest {
    @Test
    public void publicTests() {
        assertEquals(IsThisTriangle.isTriangle(1,2,2), true);
        assertEquals(IsThisTriangle.isTriangle(7,2,2), false);
    }
}
