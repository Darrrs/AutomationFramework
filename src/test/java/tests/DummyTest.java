package src.test.java.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
public class DummyTest {
    
    @Test
    public void sampleTest() {
        System.out.println("This is a dummy test.");
        Assert.assertTrue(true);
    }
}
