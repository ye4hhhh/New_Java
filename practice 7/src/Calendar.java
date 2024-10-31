import java.util.GregorianCalendar;

public class Calendar {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        int year = calendar.get(java.util.Calendar.YEAR);
        int month = calendar.get(java.util.Calendar.MONTH) + 1;
        int day = calendar.get(java.util.Calendar.DAY_OF_MONTH);

        System.out.println("Текущий год: " + year);
        System.out.println("Текущий месяц: " + month);
        System.out.println("Текущий день: " + day);

        calendar.setTimeInMillis(111222333444L);
        year = calendar.get(java.util.Calendar.YEAR);
        month = calendar.get(java.util.Calendar.MONTH) + 1;
        day = calendar.get(java.util.Calendar.DAY_OF_MONTH);

        System.out.println("Год для 111222333444L: " + year);
        System.out.println("Месяц для 111222333444L: " + month);
        System.out.println("День для 111222333444L: " + day);
    }
}