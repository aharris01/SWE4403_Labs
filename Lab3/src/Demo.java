public class Demo {
    public static void main(String args[]){
        Logger logger1 = Logger.getInstance("C:\\Code\\SWE 4403\\SWE4403_Labs\\Lab3\\SharedLogFile.txt");
        Logger logger2 = Logger.getInstance("C:\\Code\\SWE 4403\\SWE4403_Labs\\Lab3\\SharedLogFile.txt");

        logger1.write("Logger 1");
        logger2.write("Logger 2");

        logger1.closeLogger();
        logger2.closeLogger();
    }
}
