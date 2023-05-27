package compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class DirObject implements FileSystem{

  String dirName;
  List<Object> listObject;

  DirObject(String dirName){
    this.dirName = dirName;
    listObject = new ArrayList<>();
  }

  void add(Object obj){
    listObject.add(obj);
  }

  @Override
  public void printFile() {
    System.out.println(dirName);
    for (Object obj : listObject){
      if(obj instanceof FileObject){
        ((FileObject) obj).printFile();
      } else if (obj instanceof DirObject) {
        ((DirObject) obj).printFile();
      }
    }
  }
}
