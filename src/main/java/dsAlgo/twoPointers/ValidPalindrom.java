package dsAlgo.twoPointers;

public class ValidPalindrom {
  public static void main(String args[]){
    String s  = "A man, a plan, a canal: Panama";
    System.out.println(isPalindrome(s));
  }

  public static boolean isPalindrome(String s) {
    String parsed = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    String bul = new StringBuilder(parsed).reverse().toString();
    return bul.equals(parsed);
  }
}
