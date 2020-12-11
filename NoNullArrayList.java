import java.util.*;

public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T element) {
    if (element == null) {
      throw new IllegalArgumentException("You cannot add null values");
    }
    return super.add(element);
  }

  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("You cannot add null values");
    }
    super.add(index, element);
  }

  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("You cannot set null values");
    }
    return super.set(index, element);
  }



}
