public class Exercise1Demo {
    public static void main(String[] args){
        VideoEditor editor = new VideoEditor();
        editor.setText("Hello World");
        System.out.println(editor);

        editor.undo();
        System.out.println(editor);

        editor.setText("Hello World");
        editor.setContrast(0.75f);
        System.out.println(editor);

        editor.undo();
        System.out.println(editor);

        editor.undo();
        System.out.println(editor);

        editor.undo();
        System.out.println(editor);
    }
}
