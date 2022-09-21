package kata1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Person {
    private final String name;
    private final LocalDate birthdate;
    private final long MILLISECONS_PER_YEAR = (long) (365.25 * 24 * 3600 * 1000 );

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getName() {
        return name;
    }
    
    public int getAge(){
        int today = Period.between(birthdate, LocalDate.now()).getYears();
        return today;
    }
    
    private long milliSecondsToYear(long milles){
        return milles / this.MILLISECONS_PER_YEAR;
    }
}
