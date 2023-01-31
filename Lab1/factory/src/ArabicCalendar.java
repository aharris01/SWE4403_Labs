import java.util.Date;

public class ArabicCalendar implements Calendar {

    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("Event added to given Arabic date");        
    }
    
}
