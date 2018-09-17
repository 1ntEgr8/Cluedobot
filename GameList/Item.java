package GameList;

public class Item{
  String name;
  int code;
  boolean have;

  public Item(){
    name = "NA";
    code = 0;
    have = false;
  }

  public void setValue(String s, int n){
    name = s;
    code = n;
    have = false;
  }
  public String getName(){
    return name;
  }
  public int getCode(){
    return code;
  }
  public boolean getHave(){
    return have;
  }
  public void checkOff(){
    have = true;
  }
}
