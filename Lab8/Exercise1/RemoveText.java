public class RemoveText extends Action{

    private String backup;

    public RemoveText(VideoEditor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        backup();
        editor.text = "";
    }

    public void backup(){
        backup = editor.text;
    }

    public void undo(){
        editor.text = backup;
    }
}
