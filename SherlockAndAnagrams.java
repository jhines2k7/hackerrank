public class SherlockAndAnagrams {
  public static void main(String[] args){
    String s = "mission";
    int anagramSize = 1;
    int startPos = 0;
    boolean done = false;
   
    while(!done){
      // create the anagram
      for(int i = 0; i < s.length(); i++){
        for(int j = startPos; j < startPos + anagramSize; j++){
          System.out.println(s.charAt(j));
        }
      }
    }
  }
}
