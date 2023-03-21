public class SetText extends Action{

    private String text;
    private String backup;

    public SetText(VideoEditor editor, String text){
        super(editor);
        this.text = text;
    }

    @Override
    public void execute() {
        backup();
        editor.text = text;
    }

    public void backup(){
        backup = editor.text;
    }
    
    public void undo(){
        editor.text = backup;
    }
}
