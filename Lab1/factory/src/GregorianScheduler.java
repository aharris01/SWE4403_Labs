public class GregorianScheduler extends Scheduler {

    @Override
    public Calendar createCalendar() {
        return new GregorianCalendar();     
    }
    
}
