import com.sun.tools.javac.Main;

import java.util.Arrays;

public class JavaCore {


    public static boolean isSuccess(int age) {
        return age >= 18;
    }

    public static int getSuccessfulAgesCount(int[] values) {

        int completeResult = 0;
        for (int value : values) {
            if (JavaCore.isSuccess(value)) {
                completeResult++;
            }
        }
        return completeResult;
    }
}
