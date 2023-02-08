import java.util.ArrayList;

public class Logger {
    private Logger instance;
    private static ArrayList<Logger> files = new ArrayList<>();
    private String fileName;
    private ArrayList<String> contents = new ArrayList<>();

    private Logger(String fileName) {
        this.fileName = fileName;
    }
    public static Logger getLogger(String fileName){
        for(Logger instance: files){

            if(instance.fileName == fileName)
                return instance;
        }

        Logger newLogger = new Logger(fileName);
        files.add(newLogger);
        return newLogger; 
    }

    public void write(String message) {
        contents.add(message);
    }

    public String toString(){
        String output = "";
        for (String string : contents) {
            output += string + "\n";
        }
        return output;
    }
}