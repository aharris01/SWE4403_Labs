import java.util.ArrayList;

public class Editor {
    public void openProject(String path){
        ArrayList<ArtifactInterface> artifacts = new ArrayList<>();
        artifacts.add(new MainDecorator(new Artifact("Main")));
        artifacts.add(new Artifact("Demo"));
        artifacts.add(new ErrorDecorator(new Artifact("EmailClient")));
        artifacts.add(new Artifact("EmailProvider"));

        for(ArtifactInterface artifact : artifacts){
            System.out.println(artifact.render());
        }
    }
}
