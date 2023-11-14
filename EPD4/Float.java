import org.testng.Assert;
import org.testng.annotations.Test;

public class FloatTests {

    @Test
    public void testMultiplication() {
        Float num1 = 2.5f;
        Float num2 = 3.0f;
        Float result = num1 * num2;
        Assert.assertEquals(result, Float.valueOf(7.5f), "La multiplicación no es correcta");
    }
}
