package dsAlgo.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class CloneGraph {
  Node[] visited = new Node[101];
  public static void main(String args[]){
    CloneGraph t = new CloneGraph();
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    List<Node> list = new ArrayList<>();
    list.add(node2);
    list.add(node4);
    node1.neighbors = list;

    list = new ArrayList<>();
    list.add(node1);
    list.add(node3);
    node2.neighbors = list;

    list = new ArrayList<>();
    list.add(node4);
    list.add(node2);
    node3.neighbors = list;

    list = new ArrayList<>();
    list.add(node1);
    list.add(node3);
    node4.neighbors = list;
    //System.out.println(node2.neighbors.get(0) == node4.neighbors.get(0));
    Node df = t.cloneGraph(node1);
    System.out.println("");
  }
  public Node cloneGraph(Node node) {
    if(node==null)
      return null;
    Queue<Node> queue = new LinkedList<>();
    queue.add(node);
    while (!queue.isEmpty()){
      Node newNode;
      newNode = queue.poll();
      if(visited[newNode.val] == null || visited[newNode.val].val == -1){
        Node temp;
        if(visited[newNode.val] == null){
          temp = new Node(newNode.val);
        }else {
          temp = visited[newNode.val];
          temp.val = newNode.val;
        }
        for (int i=0;i<newNode.neighbors.size();i++){
          if(visited[newNode.neighbors.get(i).val]==null)
            visited[newNode.neighbors.get(i).val] = new Node(-1);
          temp.neighbors.add(visited[newNode.neighbors.get(i).val]);
          queue.add(newNode.neighbors.get(i));
        }
        visited[newNode.val] = temp;
      }else
        continue;
    }
    return visited[node.val];
  }
}
