public class VideoEditor {
    public float contrast = 0.5f;
    public String text;

    private ActionHistory history = new ActionHistory();

    public void setText(String text){
        executeAction(new SetText(this, text));
    }

    public void removeText(){
        executeAction(new RemoveText(this));
    }

    public float getContrast(){
        return contrast;
    }

    public void setContrast(float contrast){
        executeAction(new SetContrast(this, contrast));
    }

    @Override
    public String toString(){
        return "VideoEditor{" +
                "contrast=" + contrast +
                ", text='" + text + '\'' +
                '}';
       
    }

    private void executeAction(Action action){
        history.push(action);
        action.execute();
    }

    public void undo(){
        if(history.isEmpty()) return;
        Action action = history.pop();
        action.undo();
    }
}
