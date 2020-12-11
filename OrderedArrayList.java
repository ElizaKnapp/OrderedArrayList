import java.util.*;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  public boolean add(T element) {
    int index = size() - 1;
    for (int i = 0; i < size() - 1; i++) {
      if (element.compareTo(get(i)) <= 0 && element.compareTo(get(i + 1)) >= 0) {
        index = i;
      }
    }
    super.add(index, element);
    return true;
  }

  public void add(int index, T element) {
    add(element);
  }

}
