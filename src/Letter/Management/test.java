package Letter.Management;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class test {
    
    public static void main (String args[]) {
        Date date = new Date();
        System.out.println(date);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        int i = c.get(Calendar.DAY_OF_WEEK) - c.getFirstDayOfWeek();
        c.add(Calendar.DATE, -i - 7);
        Date start = c.getTime();
        c.add(Calendar.DATE, 6);
        Date end = c.getTime();
        System.out.println(start + " - " + end);
    }
    
}
