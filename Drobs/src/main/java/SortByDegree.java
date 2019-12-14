import java.util.Comparator;

public class SortByDegree implements Comparator<TMember> {
    public int compare(TMember a, TMember b) {
        if (a.getDegree() < b.getDegree()) {
            return -1;
        } else if (a.getDegree() == b.getDegree()) {
            return 0;
        } else {
            return 1;
        }
    }
}
