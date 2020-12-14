import java.util.*;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T element) {
    if (element == null) {
      throw new IllegalArgumentException("You cannot add null values");
    }
    if (size() > 0 && element.compareTo(super.get(size() - 1)) >= 0) {
      super.add(element);
    }
    else {
      super.add(findPlace(element), element);
    }
    return true;
  }

  private int findPlace(T element) {
    int index = 0;
    for (int i = 0; i < size() - 1; i++) {
      if (get(i).compareTo(element) <= 0 && get(i + 1).compareTo(element) >= 0) {
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
