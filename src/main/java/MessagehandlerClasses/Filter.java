package MessagehandlerClasses;

import java.time.LocalDate;

public class Filter {
    //по-хорошему еще сделать интерфейс
    //мб еще какую ошибку метод выкинет, проверить

    /**
     * Метод преобразует пользовательский ввод даты в более удобный для работы вид
     * @param message - пользовательский ввод даты
     */

    public static LocalDate toFilterOutData(String message) throws ArrayIndexOutOfBoundsException{
        String[] date = new String[]{"00"};

        char symbol = message.charAt(2);
        switch (symbol) {
            case ('/'):
                date = message.split("/");
                break;
            case (' '):
                date = message.split(" ");
                break;
            case ('.'):
                date = message.split("\\.");
                break;
        }

        int[] dateMonth =new int[]{Integer.parseInt(date[0]), Integer.parseInt(date[1])};
        LocalDate localDate = LocalDate.of(LocalDate.now().getYear(),
                dateMonth[1],
                dateMonth[0]);
        return localDate;
    }

}
