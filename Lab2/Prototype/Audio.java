
public class Audio implements Component{
    public String audio;

    public Audio(String audio){
        this.audio = audio;
    }

    public Audio(Audio target){
        if(target != null){
            this.audio = target.audio;
        }
    }

    public Component clone(){
        System.out.println("Duplicating Audio");
        return new Audio(this);
    }

    @Override
    public String toString(){
        return audio;
    }
}
