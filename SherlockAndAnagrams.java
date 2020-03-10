public class SherlockAndAnagrams {
  public static void main(String[] args){
    String s = "mission";
    int anagramSize = 1;
    int numAnagrams = s.length();
   
    while(anagramSize < s.length()){
      int startPos = 0;
      // create the anagram
      for(int i = 1; i <= numAnagrams; i++){
        for(int j = startPos; j < startPos + anagramSize; j++){
          System.out.print(s.charAt(j));
        }
          
        System.out.println();
        startPos++;
      }

      anagramSize++;
      numAnagrams--;
    }
  }
}
