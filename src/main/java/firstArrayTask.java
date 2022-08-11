public class firstArrayTask {


    public static boolean isSuccess(int number) {
        return number % 2 == 0;
    }

    public static int evenNumbersCount(int[] values) {

        int completeResult = 0;
        for (int value : values) {
            if (firstArrayTask.isSuccess(value)) {
                completeResult++;
            }

        }
        return completeResult;
    }
}
