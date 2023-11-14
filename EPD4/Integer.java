import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegerTests {

    @Test
    public void testAddition() {
        Integer num1 = 5;
        Integer num2 = 10;
        Integer result = num1 + num2;
        Assert.assertEquals(result, Integer.valueOf(15), "La suma no es correcta");
    }
}
