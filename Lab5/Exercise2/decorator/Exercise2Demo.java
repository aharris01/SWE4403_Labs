package decorator;

public class Exercise2Demo {
    public static void main(String[] args){
        System.out.println("Exercise 2");
        show();
    }

    public static void show() {
        Editor editor = new Editor();
        editor.openProject("...");
    }
}
