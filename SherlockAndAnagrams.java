import java.util.HashSet;
import java.util.Set;

public class SherlockAndAnagrams {
  public static void main(String[] args){
    String s = "mission";
    int anagramSize = 1;
    int numAnagrams = s.length();
    int anagramCount = 0;
  
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

        for(int k = 0; k < anagramSize)
          
        //System.out.println();
        startPos++;
      }

      anagramSize++;
      numAnagrams--;
    }
  }
}
