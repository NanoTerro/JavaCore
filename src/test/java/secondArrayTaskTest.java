import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class secondArrayTaskTest {

    @Test
    public void test() {
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;

        int[] secondArray = new int[2];
        secondArray[0] = 4;
        secondArray[1] = 5;

        int expectedResult = 5;
        int result = secondArrayTask.fullSize(firstArray, secondArray);
        Assert.assertEquals(expectedResult, result);
    }

}