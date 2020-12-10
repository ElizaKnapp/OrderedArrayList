import java.util.*;

public class NoNullArrayList<T> extends ArrayList<T> {
  private ArrayList<T> list;

  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }


  //important- this doesn't work because everytime it adds there are odds

}
