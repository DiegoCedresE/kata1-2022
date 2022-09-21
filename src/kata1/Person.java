package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Person {
    private final String name;
    private final Calendar birthdate;
    private final long MILLISECONS_PER_YEAR = (long) (365.25 * 24 * 3600 * 1000 );

    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }

    public String getName() {
        return name;
    }
    
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int) this.milliSecondsToYear(today.getTimeInMillis() - birthdate.getTimeInMillis());
    }
    
    private long milliSecondsToYear(long milles){
        return milles / this.MILLISECONS_PER_YEAR;
    }
}
