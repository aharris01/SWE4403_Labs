import java.util.ArrayList;

public class Team implements Resource{
    private ArrayList<Resource> resources = new ArrayList<>();

    public void add(Resource resource){
        resources.add(resource);
    }

    public void remove(Resource resource){
        resources.remove(resource);
    }

    public void getResource(int index){
        resources.get(index);
    }

    @Override
    public void deploy() {
        for(Resource resource : resources){
            resource.deploy();
        }
    }
    
}
