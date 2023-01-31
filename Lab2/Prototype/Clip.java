
public class Clip implements Component{
    public String video;

    public Clip(String video){
        this.video = video;
    }

    public Clip(Clip target){
        if(target != null){
            this.video = target.video;
        }
    }

    public Component clone(){
        System.out.println("Duplicating Clip");
        return new Clip(this);
    }

    @Override
    public String toString(){
        return video;
    }
}
