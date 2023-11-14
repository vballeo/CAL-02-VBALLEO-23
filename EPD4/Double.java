import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleTests {

    @Test
    public void testDivision() {
        Double num1 = 10.0;
        Double num2 = 2.0;
        Double result = num1 / num2;
        Assert.assertEquals(result, Double.valueOf(5.0), "La división no es correcta");
    }
}
