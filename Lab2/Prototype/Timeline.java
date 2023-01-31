
import java.util.ArrayList;
import java.util.List;

public class Timeline {
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public String toString(){
        String timelineString = "";
        for (Component component : components) {
            timelineString += component + " ";
        }
        return timelineString;
    }

}
