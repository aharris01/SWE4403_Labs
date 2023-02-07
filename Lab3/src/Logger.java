import java.io.*;

public class Logger {
    private static Logger logger;
    private String fileName;
    private static PrintWriter file;

    private Logger(String fileName) {
        this.fileName = fileName;
        startLogger();
    }
    public void write(String message) {
        System.out.println("Writing a message to the log.");
        file.println(message);
    }

    public static Logger getInstance(String fileName){
        if(file == null){
            logger = new Logger(fileName);
        }
        return logger;
    }

    private void startLogger(){
        try{
            file = new PrintWriter(fileName);
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public void closeLogger(){
        try{
            file.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}