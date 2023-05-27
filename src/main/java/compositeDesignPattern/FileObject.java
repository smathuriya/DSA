package compositeDesignPattern;

public class FileObject implements FileSystem{

  String name;
  FileObject(String name){
    this.name = name;
  }

  @Override
  public void printFile() {
    System.out.println(name);
  }
}
