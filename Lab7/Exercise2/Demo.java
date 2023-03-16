import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            arrayList.add((int)(Math.random()*10));
        }

        System.out.println(arrayList);

        FindMaxIterable.findMax(arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            linkedList.add((int)(Math.random()*10));
        }

        System.out.println(linkedList);

        FindMaxIterable.findMax(linkedList);
    }
}
