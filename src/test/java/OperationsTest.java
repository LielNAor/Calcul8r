import org.junit.Test;
import org.junit.Assert;

public class OperationsTest {
    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals(2, Operations.add(1, 1));
    }

    @Test
    public void testSubtract() throws Exception {
        Assert.assertEquals(0, Operations.subtract(1, 1));
    }

    @Test
    public void testMultiply() throws Exception {
        Assert.assertEquals(4, Operations.multiply(2, 2));
    }
    
    @Test
    public void testDivision() throws Exception {
    	double result = 2.0;
        Assert.assertEquals(result, Operations.divide(4, 2) , 0.0);
    	result = 0.0;
        Assert.assertEquals(result, Operations.divide(4, 0) , 0.0);
    }
}
