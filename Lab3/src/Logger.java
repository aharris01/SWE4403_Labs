import java.util.ArrayList;
import java.util.HashMap;

public class Logger {
    private static HashMap<String, Logger> files = new HashMap<>();
    private String fileName;
    private ArrayList<String> contents = new ArrayList<>();

    private Logger(String fileName) {
        this.fileName = fileName;
    }
    public static Logger getLogger(String fileName){
        if(files.containsKey(fileName)){
            return files.get(fileName);
        }

        Logger newLogger = new Logger(fileName);
        files.put(fileName, newLogger);
        return newLogger; 
    }

    public void write(String message) {
        contents.add(message);
    }

    public static HashMap<String, Logger> getFiles(){
        return files;
    }

    public String toString(){
        String output = "";
        for (String string : contents) {
            output += string + "\n";
        }
        return output;
    }
}