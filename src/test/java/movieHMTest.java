import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class movieHMTest {

    @Test
    public void test() {
        String expectedResult = "Incorrect age, please, check up the user with the given age.";
        String result = branchoperators.movie.movieHM.accessMovie(0);
        Assert.assertEquals(expectedResult, result);
    }

}