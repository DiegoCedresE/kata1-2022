package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        System.out.println("Hello world");
        Person person = new Person("Zakarias", new Date(101, 8, 24));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
        
    }
    
}
