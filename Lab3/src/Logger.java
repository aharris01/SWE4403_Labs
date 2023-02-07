import java.io.*;

public class Logger {
    private static Logger logger;
    private String fileName;
    private static FileOutputStream file;
    private PrintWriter writer;

    private Logger(String fileName) {
        this.fileName = fileName;
    }

    public void write(String message) {
        System.out.println("Writing a message to the log.");
        startLogger();
        writer.println(message);
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
            file = new FileOutputStream(fileName);
            writer = new PrintWriter(file);
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public void closeLogger(){
        try{
            writer.close();
            file.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}