import java.util.HashMap;

public class MultithreadDemo {
    public static void main(String[] args){
        Thread t1 = new Thread(new connectionOne());
        Thread t2 = new Thread(new connectionTwo());

        t1.start();
        t2.start();
    }
}

class connectionOne implements Runnable{

    @Override
    public void run() {
        Logger logger = Logger.getLogger("Database");
        logger.write("Connection one writes once");
        logger.write("Connection one writes twice");
        logger.write("Connection one writes three times\n");

        try{
            Thread.sleep(2000);
        }catch(Exception e){}

        System.out.println("Connection one Logger contents: \n");
        System.out.print(logger);

        System.out.print("Connection one logger hashcode: ");
        System.out.println(logger.hashCode() + "\n");
    }
}

class connectionTwo implements Runnable{

    @Override
    public void run(){
        Logger logger = Logger.getLogger("Database");
        logger.write("Connection two writes once");
        logger.write("Connection two writes twice");
        logger.write("Connection two writes three times\n");
        System.out.println("Connection two Logger contents: \n");
        System.out.print(logger);

        System.out.print("Connection two logger hashcode: ");
        System.out.println(logger.hashCode() + "\n");
    }
}