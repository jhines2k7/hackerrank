import java.util.HashSet;
import java.util.Set;

public class SherlockAndAnagrams {
  public static void main(String[] args){
    String s = "abcd";
    int anagramSize = 1;
    int numAnagrams = s.length();
    int anagrammaticPairs = 0;
  
    Set<Character> anagramCharSet;
   
    while(anagramSize < s.length()){
      int startPos = 0;
      // create the anagram
      
      anagramCharSet = new HashSet<>();
      
      for(int i = 1; i <= numAnagrams; i++){
        for(int j = startPos; j < startPos + anagramSize; j++){
          //System.out.print(s.charAt(j));
    
          // create the anagram hash set
          anagramCharSet.add(s.charAt(j));
        }

        int matchCount = 0;

        for(int k = 0; k < s.length(); k++) {
          for(int l = k; l < anagramSize; l++) {
            if(anagramCharSet.contains(s.charAt(l))) {
              matchCount++;
            }
          }

          if(matchCount == anagramSize) {
            anagrammaticPairs++;
          }

          matchCount = 0;
        }
          
        //System.out.println();
        startPos++;
      }

      anagramSize++;
      numAnagrams--;
    }

    System.out.println("Number of anagrammatic pairs: " + anagrammaticPairs);
  }
}
