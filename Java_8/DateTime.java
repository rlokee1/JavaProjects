package Java_8;
import java.time.LocalDate;
import java.time.LocalTime;
public class DateTime {
    public static void main(String[]args){
        LocalDate Ld = LocalDate.now();
        System.out.println(Ld);
        LocalTime Lt = LocalTime.now();
        System.out.println(Lt);
        int day=Ld.getDayOfMonth();
        int month=Ld.getMonthValue();
        int year=Ld.getYear();
        int hour=Lt.getHour();
        int minute=Lt.getMinute();
        int second=Lt.getSecond();
        int nano=Lt.getNano();

        java.util.Date w = new java.util.Date();
        System.out.println(w);

        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        System.out.println(nano);


    }
}
