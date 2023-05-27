package dsAlgo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Trie {

  static TrieNode root;

  public static void main(String args[]){




    String keys[] = {"the", "a", "there", "answer", "any",
                     "by", "bye", "their"};
    Trie trie = new Trie();
    for (String str : keys){
      trie.add(str);
    }
    System.out.println(trie.find("a.s.er", root));
  }
  private boolean find(String str, TrieNode node) {
    //TrieNode node = root;
    if(node == null)
      return false;
    for (int i=0;i<str.length();i++){
      if(node == null)
        return false;
      if(str.charAt(i)=='.'){
        for (TrieNode n : node.children){
          if(find(str.substring(i+1), n))
            return true;
        }
      }
      node = node.children[str.charAt(i)-'a'];
    }
    return node.eos;
  }

  private void add(String str) {

    if(root == null){
      root = new TrieNode();
    }
    TrieNode node = root;
    for (char c : str.toCharArray()){
      if(node.children[c-'a'] == null){
        node.children[c-'a'] = new TrieNode();
      }
      node = node.children[c-'a'];
    }
    node.eos = true;
  }
}

class TrieNode{
  TrieNode[] children;
  boolean eos;

  public TrieNode(){
    children = new TrieNode[26];
    eos = false;
  }
}
