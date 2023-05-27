package dsAlgo;

public class VowelsofAllSubstrings_2063 {
  public static void main(String args[]){
   String str="noosabasboosa";
   System.out.println(countVowels(str));
  }

  static public long countVowels(String word) {
    long ans = 0l;
    long len = word.length();
    for (int i=0;i<len;i++){
      char c = word.charAt(i);
      if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'){
        ans += (i+1)*(len-i);
      }
    }
    return ans;
  }
}
