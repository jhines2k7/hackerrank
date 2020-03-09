public class SherlockAndAnagrams {
  public static void main(String[] args){
    String s = "mission";
    int anagramSize = 1;
    int startPos = 0;
    int numAnagrams = s.length();
   
    while(anagramSize < s.length()){
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
