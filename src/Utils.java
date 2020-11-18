public class Utils implements Comparable<Utils>{
    int objects;

    public Utils(int objects){
        this.objects = objects;
    }

    @Override
    public int compareTo(Utils o) {
        return this.objects - o.objects;
    }

    @Override
    public String toString() {
        return "Value is " + objects;
    }
}
