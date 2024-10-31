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

        calendar.setTimeInMillis(1234567898765L);
        year = calendar.get(java.util.Calendar.YEAR);
        month = calendar.get(java.util.Calendar.MONTH) + 1;
        day = calendar.get(java.util.Calendar.DAY_OF_MONTH);

        System.out.println("Год для 1234567898765L: " + year);
        System.out.println("Месяц для 1234567898765L: " + month);
        System.out.println("День для 1234567898765L: " + day);
    }
}