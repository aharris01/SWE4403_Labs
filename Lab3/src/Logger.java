import java.util.ArrayList;

public class Logger {
    private static Logger instance;
    private static ArrayList<String> files = new ArrayList<>();
    private String fileName;
    private ArrayList<String> contents = new ArrayList<>();

    private Logger(String fileName) {
        files.add(fileName);
        this.fileName = fileName;
    }
    public static Logger getLogger(String fileName){
        if(!files.contains(fileName)){
            instance = new Logger(fileName);
        }
        return instance;
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