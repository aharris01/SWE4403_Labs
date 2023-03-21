public abstract class Action {
    protected VideoEditor editor;

    public Action(VideoEditor editor){
        this.editor = editor;
    }

    abstract public void execute();

    abstract public void undo();
}
