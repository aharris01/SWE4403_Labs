import java.io.*;

public class Logger {
    private static Logger logger;
    private String fileName;
    private static File file;
    private PrintWriter writer;

    private Logger(String fileName) {
        this.fileName = fileName;
        file = new File(fileName);
    }

    public void write(String message) {
        System.out.println("Writing a message to the log.");
        startLogger();
        writer.println(message);
        writer.flush();
        closeLogger();
    }

    public static Logger getInstance(String fileName){
        if(file == null){
            logger = new Logger(fileName);
        }
        return logger;
    }

    private void startLogger(){
        try{
            writer = new PrintWriter(fileName);
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public void closeLogger(){
        try{
            writer.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}