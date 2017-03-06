import java.util.*;

public class CountOccurrenceWords {
  public static void main(String[] args) {
    String text = "Good morning. Have a good class. " +
      "Have a good visit. Have fun!";

    TreeMap<String, Integer> map = new TreeMap<String, Integer>();

    String[] words = text.split("[ \n\t\r.,;!?(){]");
    for (int i = 0; i < words.length; i++) {
      String key = words[i].toLowerCase();

      if (key.length() > 0) {
        if (map.get(key) == null) {
          map.put(key, 1);
        }
        else {
          int value = map.get(key).intValue();
          value++;
          map.put(key, value);
        }
      }
    }

    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

    for (Map.Entry<String, Integer> entry: entrySet) {
      System.out.println(entry.getValue() + "\t" + entry.getKey());
    }
  }
}