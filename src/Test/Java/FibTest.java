package Test.Java;
import org.junit.*;
import main.Fibbb;
import java.util.Arrays;

    public class FibTest {
        Fibbb fib;

        @Before
        public void setupInstance() {
            fib = new Fibbb();
        }

        @Test
        public void assertingFibonacciSequenceIsCorrect() {
            int[] setSequence = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
            int n = 10;

            int[] actualSequence = fib.Fibbbi(n);

            Assert.assertArrayEquals(setSequence, actualSequence);
        }
    }


