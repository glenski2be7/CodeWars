import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReturnNegative {

    public static int makeNegative(final int x) {
        return Math.abs(x) * -1;
        //x *= -1;
        //return x;
    }
}

