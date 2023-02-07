import java.io.*;

public class Logger {
    private String fileName;
    private PrintWriter file;

    public Logger(String fileName) {
        this.fileName = fileName;
        startLogger();
    }
    public void write(String message) {
        System.out.println("Writing a message to the log.");
        file.println(message);
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