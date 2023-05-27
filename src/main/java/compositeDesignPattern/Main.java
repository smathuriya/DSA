package compositeDesignPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Main {
  public static void main(String args[]){

    System.out.println("hello");
    DirObject d1 = new DirObject("movie dir");
    FileObject southmovie1 = new FileObject("southmovie1");
    FileObject southmovie2 = new FileObject("southmovie2");

    FileObject hindiMovie1 = new FileObject("hindiMovie1");
    FileObject hindiMovie2 = new FileObject("hindiMovie2");

    DirObject hindi = new DirObject("hindi movie dir");
    DirObject south = new DirObject("south movie dir");
    hindi.add(hindiMovie1);
    hindi.add(hindiMovie2);
    south.add(southmovie1);
    south.add(southmovie2);
    d1.add(hindi);
    d1.add(south);
    d1.printFile();
  }
}
