package kata1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate date;
        date = LocalDate.of(2001, Month.JUNE, 6);
        System.out.println("Hello world");
        Person person = new Person("Zakarias", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
        
    }
    
}
