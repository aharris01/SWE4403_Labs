public class SetContrast extends Action{

    private float contrast;
    private float backup;

    public SetContrast(VideoEditor editor, float contrast){
        super(editor);
        this.contrast = contrast;
    }

    @Override
    public void execute() {
        backup();
        editor.contrast = contrast;
    }

    public void backup(){
        backup = editor.contrast;
    }

    public void undo(){
        editor.contrast = backup;
    }
}
