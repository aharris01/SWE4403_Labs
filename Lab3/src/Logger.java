import java.util.ArrayList;
import java.util.HashMap;

public class Logger {
    private volatile static HashMap<String, Logger> files = new HashMap<>();
    private String fileName;
    private ArrayList<String> contents = new ArrayList<>();

    private Logger(String fileName) {
        this.fileName = fileName;
    }
    public static Logger getLogger(String fileName){
        if(!files.containsKey(fileName)){
            synchronized(files){
                if(!files.containsKey(fileName)){
                    Logger newLogger = new Logger(fileName);
                    files.put(fileName, newLogger);
                    return newLogger;
                }
            }
        }

        return files.get(fileName); 
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