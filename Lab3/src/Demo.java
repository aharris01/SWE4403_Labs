public class Demo {
    public static void main(String args[]){
        Logger logger1 = new Logger("C:\\Code\\SWE 4403\\SWE4403_Labs\\Lab3\\SharedLogFile.txt");
        Logger logger2 = new Logger("C:\\Code\\SWE 4403\\SWE4403_Labs\\Lab3\\SharedLogFile.txt");

        logger1.write("Logger 1");
        logger2.write("Logger 2");

        logger1.closeLogger();
        logger2.closeLogger();

        logger1 = new Logger("LogFile1.txt");
        logger2 = new Logger("LogFile2.txt");

        logger1.write("Logger 1");
        logger2.write("Logger 2");

        logger1.closeLogger();
        logger2.closeLogger();
    }
}
