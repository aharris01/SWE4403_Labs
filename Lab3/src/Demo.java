public class Demo {
    public static void main(String[] args){
        Logger logger1 = new Logger("file 1");
        Logger logger2 = new Logger("file 1");

        System.out.print("Multiple loggers can write to the same file: ");
        System.out.println(logger1 == logger2);

        Logger logger3 = new Logger("file 2");

        System.out.print("Multiple loggers can write to different files: ");
        System.out.println(logger2 != logger3);
    }
}
