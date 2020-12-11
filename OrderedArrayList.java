import java.util.*;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  public boolean add(T element) {
    super.add(findIndex(element), element);
    return true;
  }

  private int findIndex(T element) {
    int index = size() - 1;
    for (int i = 0; i < size() - 1; i++) {
      if (element.compareTo(get(i)) <= 0 && element.compareTo(get(i + 1)) >= 0) {
        index = i;
      }
    }
    return index;
  }

  public void add(int index, T element) {
    add(element);
  }

  public T set(int index, T element) {
    T holder = get(index);
    super.remove(index);
    add(element);
    return holder;
  }

}
