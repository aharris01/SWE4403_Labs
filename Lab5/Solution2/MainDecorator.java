public class MainDecorator extends ArtifactDecorator{

    public MainDecorator(ArtifactInterface artifact) {
        super(artifact);
    }

    @Override
    public String render() {
        return artifact.render() + " [Main]";
    }
    
}
