
public class Text implements Component{
    private String content;

    public Text(String content) {
        this.content = content;
    }

    public Text(Text target){
        if(target != null){
            this.content = target.content;
        }
    }

    public String getContent() {
        return content;
    }

    public Component clone(){
        System.out.println("Duplicating Text");
        return new Text(this);
    }

    @Override
    public String toString(){
        return getContent();
    }

}
