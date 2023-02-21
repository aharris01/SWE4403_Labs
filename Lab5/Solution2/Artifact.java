public class Artifact implements ArtifactInterface{
    private String name;

    public Artifact(String name){
        this.name = name;
    }

    @Override
    public String render() {
        return name;
    }
}
