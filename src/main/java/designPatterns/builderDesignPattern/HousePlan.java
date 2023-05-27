package designPatterns.builderDesignPattern;

interface HousePlan {
  public void buildWall(String str);
  public void buildRoof(String str);
}

class House implements HousePlan{

  private String wall;
  private String roof;
  @Override
  public void buildWall(String str) {
    this.wall = str;
  }

  @Override
  public void buildRoof(String str) {
    this.roof = str;
  }

  public String getWall(){
    return this.wall;
  }
}

interface HouseBuilder{
  public void buildWall();
  public void buildRoof();
  public House getHouse();

  public String getWall();
}

class IgnooHouse implements HouseBuilder{
  House ignooHouse;
  IgnooHouse(){
    ignooHouse = new House();
  }
  @Override
  public void buildWall() {
    ignooHouse.buildWall("ice wall");
  }

  @Override
  public void buildRoof() {
  ignooHouse.buildRoof("ice roof");
  }

  @Override
  public House getHouse() {
    return ignooHouse;
  }

  @Override
  public String getWall() {
    return ignooHouse.getWall();
  }
}

