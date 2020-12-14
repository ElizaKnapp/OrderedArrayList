import java.util.*;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T element) {
    super.add(findPlace(element), element);
    return true;
  }

  private int findPlace(T element) {
    if (element == null) {
      throw new IllegalArgumentException("You cannot add null values");
    }
    int index = 0;
    for (int i = 0; i < size() - 1; i++) {
      if (get(i).compareTo(element) <= 0 && element.compareTo(get(i + 1)) <= 0) {
        index = i + 1;
      }
    }
    return index;
  }

  public void add(int index, T element) {
    add(element);
  }

  public T set(int index, T element) {
    T holder = super.get(index);
    super.remove(index);
    add(element);
    return holder;
  }

}
