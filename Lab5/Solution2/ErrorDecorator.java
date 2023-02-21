public class ErrorDecorator extends ArtifactDecorator{

    public ErrorDecorator(ArtifactInterface artifact) {
        super(artifact);
    }

    @Override
    public String render() {
        return artifact.render() + " [Error]";
    }
    
}
