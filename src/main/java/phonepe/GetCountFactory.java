package phonepe;

public class GetCountFactory {

  public Count getCount(String factory){

    switch (factory){
      case "countbytag":
        return new GetCountByTag();
      default:
        return new CountNULL();
    }
  }
}
