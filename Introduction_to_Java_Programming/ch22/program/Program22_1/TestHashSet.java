import java.util.*;

public class TestHashSet {
  public static void main(String[] args) {
    Set<String> set = new HashSet<String>();

    set.add("London");
    set.add("Paris");
    set.add("New York");
    set.add("San Francisco");
    set.add("Beijing");
    set.add("New York");

    System.out.println(set);

    Iterator<String> iterator = set.iterator();

    while (iterator.hasNext()) {
      System.out.print(iterator.next().toUpperCase() + " ");
    }
  }
}