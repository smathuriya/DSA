package dsAlgo;

public class DecodeWays {
  public static void main(String args[]){
    System.out.println(numDecodings("1110111"));
  }
  public static int numDecodings(String s) {
    int n=s.length();
    Integer[] mem=new Integer[n];
    return s.length()==0?0:numDecodings(0,s,mem);
  }
  private static int numDecodings(int p, String s, Integer[] mem) {
    if(p==s.length())
      return 1;
    if(mem[p]!=null) return mem[p];
    if(s.charAt(p)=='0') return 0;
    int res = numDecodings(p+1,s,mem);
    if(p<s.length()-1)
      res+=numDecodings(p+2,s,mem);
    return mem[p]=res;
    /*int n=s.length();
    if(p==n) return 1;
    if(s.charAt(p)=='0') return 0;
    if(mem[p]!=null) return mem[p];
    int res=numDecodings(p+1,s,mem);
    if(p<n-1&&(s.charAt(p)=='1'||s.charAt(p)=='2'&&s.charAt(p+1)<'7'))
      res+=numDecodings(p+2,s,mem);
    return mem[p]=res;*/
  }
}
