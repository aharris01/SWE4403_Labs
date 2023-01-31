
import java.util.Date;

public abstract class Scheduler {
    private Calendar calendar = createCalendar();

    public abstract Calendar createCalendar();

    public void schedule(Event event) {
        Date today = new Date();
        calendar.addEvent(event, today);
    }
}
