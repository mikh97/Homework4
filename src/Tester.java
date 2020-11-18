import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Utils> list = new ArrayList<>();
        list.add(new Pair(2));
        list.add(new Pair(21));
        list.add(new Pair(8));

        System.out.println(min(list));
        System.out.println(max(list));
    }

    public static <E extends Comparable<E>> E min(ArrayList<E> objects) {
        E smallest = objects.get(0);

        for(E obj : objects) {
            if (obj.compareTo(smallest) < 0){
                smallest = obj;
            }
        } return smallest;
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> objects) {
        E largest = objects.get(0);

        for(E obj : objects) {
            if (obj.compareTo(largest) > 0){
                largest = obj;
            }
        } return largest;

    }
}
