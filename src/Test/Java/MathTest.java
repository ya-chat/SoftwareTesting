package Test.Java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class MathTest {

    Math maths;
    @Before
    public void setUpInstance(){maths = new Math();}

    @Test
    public void checkIfNumberIsPrime(){
        Assert.assertTrue(maths.isPrime(13));
    }

}
