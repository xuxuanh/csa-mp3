import java.util.*;

public class WordChecker {
  private ArrayList<String> wordList;

  public WordChecker(ArrayList<String> words) {
    wordList = words;
  }

  public boolean isWordChain() {
    for (int i = 1; i<wordList.size();i++){
      if (wordList.get(i).indexOf(wordList.get(i-1))==-1){
        return false;
      }
    }
    return true;
  }


  public ArrayList<String> createList(String target) {
    ArrayList<String> result = new ArrayList<String>();
    for (int i = 0; i<wordList.size(); i++){
      int index = wordList.get(i).indexOf(target);
      if (index == 0){
        result.add(wordList.get(i).substring(target.length()));
      }
    }
    return result;             
  }
}
