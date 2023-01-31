public class ArabicScheduler extends Scheduler {

    @Override
    public Calendar createCalendar() {
        return new ArabicCalendar();
    }
    
}
