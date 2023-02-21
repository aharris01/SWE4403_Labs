public abstract class ArtifactDecorator implements ArtifactInterface{
    protected ArtifactInterface artifact;

    public ArtifactDecorator(ArtifactInterface artifact){
        this.artifact = artifact;
    }
}
