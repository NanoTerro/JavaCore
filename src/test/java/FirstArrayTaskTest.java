import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstArrayTaskTest {

    @Test
    public void testFirst() {
        int[] numbers = new int[5];

        numbers[0] = 5;
        numbers[1] = 7;
        numbers[2] = 8;
        numbers[3] = 111;
        numbers[4] = 112;
        int expectedResult = 2;
        int result = firstArrayTask.evenNumbersCount(numbers);
        Assert.assertEquals(expectedResult, result);

    }
    @Test
    public void testSecond() {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        int expectedResult = 0;
        int result = firstArrayTask.evenNumbersCount(numbers);
        Assert.assertEquals(expectedResult, result);

    }

}