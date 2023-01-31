
public class Demo {
    public static void show() {
        Scheduler scheduler = createScheduler("Arabic");
        scheduler.schedule(null);
    }

    public static Scheduler createScheduler(String scheduleType){
        if(scheduleType == "Gregorian"){
            return new GregorianScheduler();
        } 
        else if(scheduleType == "Arabic"){
            return new ArabicScheduler();
        }
        else{
            System.out.println("Unknown calendar type");
            return null;
        } 
    }

    public static void main(String args[]){
        show();
    }
}
