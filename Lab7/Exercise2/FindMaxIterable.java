import java.util.Iterator;

public class FindMaxIterable {
    public static <T> void findMax(Iterable<T> iterable){
        int currentMax = 0;

        Iterator<T> iterator = iterable.iterator();
        while(iterator.hasNext()){
            int next = (int)iterator.next();
            if(currentMax < next) currentMax = next;
            System.out.println(currentMax);
        }
    }
}
