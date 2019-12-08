import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TSet<T extends Operations> {


    private Set<T> tSet;

    public TSet() {
        tSet = new TreeSet<>();
    }

    public void clear() {
        tSet.clear();
    }

    public void add(T data) {
        tSet.add(data);
    }

    public void remove(T data) {
        tSet.remove(data);
    }

    public boolean isEmpty() {
        return tSet.isEmpty();
    }

    public boolean contains(T data) {
        return tSet.contains(data);
    }
    public TSet<T> combine(TSet<T> otherSet) {
        tSet.addAll(otherSet.getTSet());
        return this;
    }

    public TSet<T> subtraction(TSet<T> otherSet) {
        tSet = tSet.stream()
                .filter(element -> !otherSet.contains(element))
                .collect(Collectors.toSet());
        return this;
    }

    public TSet<T> multiply(TSet<T> otherSet) {
        tSet = tSet.stream()
                .filter(otherSet::contains)
                .collect(Collectors.toSet());
        return this;
    }

    public int count() {
        return tSet.size();
    }

    public T getElement(Integer i) {
        Integer j = 0;
        for (T element: tSet) {
            if (j.equals(i)) {
                return element;
            }
            j++;
        }
        return null;
    }
    public Set<T> getTSet() {
        return tSet;
    }
}
