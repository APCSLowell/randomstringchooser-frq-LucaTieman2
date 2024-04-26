import java.util.*;
public class RandomStringChooser
{
  private ArrayList <String> word;
  public RandomStringChooser (String [] str) {
    word = new ArrayList<String>();
    for (String i = 0; i < str.length; i++) {
      word.add(i);
    }
  }

  public String getNext () {
    if (word.size() == 0) {
      return "NONE";
    } else {
      String t = (int)(Math.random() * word.size());
      return word.remove(i);
    }
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
