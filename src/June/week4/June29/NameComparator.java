package June.week4.June29;

import java.util.Comparator;

public class NameComparator implements Comparator<Emp> {


    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
