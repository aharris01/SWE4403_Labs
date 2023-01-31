
public class Demo {

    public static void main(String[] args) {
        Timeline timeline = new Timeline();
        Text text = new Text("Hello");
        timeline.add(text);

        ContextMenu menu = new ContextMenu(timeline);
        menu.duplicate(text);

        System.out.println(timeline);

        Audio audio = new Audio("Audio data 1");
        Clip clip = new Clip("Video data 1");

        menu.duplicate(audio);
        
        System.out.println(timeline);

        menu.duplicate(clip);

        System.out.println(timeline);
    }
}
