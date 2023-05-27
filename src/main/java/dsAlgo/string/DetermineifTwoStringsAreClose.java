package dsAlgo.string;

import java.util.Arrays;

import dsAlgo.linkedlist.AddTwoNumbersII;

public class DetermineifTwoStringsAreClose {

  public static void main(String args[]) {
    DetermineifTwoStringsAreClose obj = new DetermineifTwoStringsAreClose();
    String word1 = "cabbba", word2 = "abbccc";
    System.out.println(obj.closeStrings(word1, word2));
  }
  public boolean closeStrings(String word1, String word2) {
    if(word1.length() != word2.length())
      return false;
    int[] arr1 = new int[26];
    int[] arr2 = new int[26];
    for (char c : word1.toCharArray()){
      arr1[c-'a'] = arr1[c-'a']+1;
    }
    for (char c : word2.toCharArray()){
      arr2[c-'a'] = arr2[c-'a']+1;
    }
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    int count = 0;
    for (int i=0;i<26;i++){
      if(arr1[i] != arr2[i])
        return false;

    }
    for (int i=0;i<word1.length();i++) {
      if (word1.charAt(i) != word2.charAt(i))
        count++;
    }
    if(count%2==0)
      return true;
    return false;
  }
}