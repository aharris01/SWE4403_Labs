import java.util.Date;

public class GregorianCalendar implements Calendar {

    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("Event added to given Gregorian date");
    }
    
}
