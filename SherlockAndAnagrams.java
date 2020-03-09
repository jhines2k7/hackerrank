public class SherlockAndAnagrams {
  public static void main(String[] args){
    String s = "mission";
    int anagramSize = 1;
    int startPos = 0;
    boolean done = false;
   
    while(anagramSize < s.length()){
      // create the anagram
      for(int i = startPos; i <= anagramSize; i++){
        for(int j = i; j < startPos + anagramSize; j++){
          System.out.print(s.charAt(j));
        }
          
        System.out.println();
      }

      anagramSize++;
      startPos++;
    }
  }
}
