import java.util.ArrayList;
import java.util.Iterator;

public class FindMax {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add((int)(Math.random()*10));
        }

        System.out.println(list);

        int currentMax = 0;
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int next = iterator.next();
            if(currentMax < next) currentMax = next;
            System.out.println(currentMax);
        }
    }
}
