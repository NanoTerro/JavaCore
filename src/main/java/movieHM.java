package branchoperators.movie;

/**
 * Сервис доступа в кинотеатр.
 */
public class movieHM {

    // Данный код можно удалить, он служит для наглядности.
    public static void main(String[] args) {
        System.out.println(movieHM.accessMovie(19));
        System.out.println(movieHM.accessMovie(22));
        System.out.println(movieHM.accessMovie(15));
        System.out.println(movieHM.accessMovie(-1));
    }

    /**
     * Данный метод вовзращает строку уведомляющую о правах доступа в кинотеатр.
     * @param age возраст посетителя
     * @return строка с правами доступа.
     */
    public static String accessMovie(int age) {
        if (age >= 18 && age <= 21) {
            return "Rating R. Access is allowed.";
        } else if (age > 21) {
            return "Rating F. Access is allowed.";
        } else if (age <= 0) {
            return "Incorrect age, please, check up the user with the given age.";
        } else {
            return "Access is denied";
        }
    }
}
