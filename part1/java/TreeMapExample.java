import java.util.TreeMap;

/**
 * @author ahalikov
 */
public class TreeMapExample {

    static class Racer implements Comparable<Racer> {
        String name;
        int time;

        public Racer(String name, int time) {
            this.name = name;
            this.time = time;
        }

        @Override
        public int compareTo(Racer o) {
            return this.time - o.time;
        }

        @Override
        public String toString() {
            return "Racer{" +
                    "name='" + name + '\'' +
                    ", time=" + time +
                    '}';
        }
    }

    static final Racer[] racers = new Racer[] {
            new Racer("Adam", 10),
            new Racer("Michael", 9),
            new Racer("Tomas", 15),
            new Racer("Arthur", 6),
            new Racer("John", 17)
    };

    public static void main(String[] args) {
        TreeMap<Racer, Integer> results = new TreeMap<>();
        for (Racer racer: racers)
            results.put(racer, racer.time);

        System.out.println(results.firstEntry());
    }
}
