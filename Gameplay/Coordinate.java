package Gameplay;

public class Coordinate{
  int x;
  int y;
  int sector;
  String opensTo;
  int linkx;
  int linky;
  String movDirection;

  public Coordinate(){
    x = 0;
    y = 0;
    sector = 0;
  }

  public Coordinate(int a, int b, int sec, int lx, int ly, String dir){
    x = a;
    y = b;
    sector = sec;
    linkx = lx;
    linky = ly;
    movDirection = dir;
  }

  public Coordinate(int a, int b){
    x = a;
    y = b;
  }

  public Coordinate(int a, int b, String op){
    x = a;
    y = b;
    opensTo = op;
  }

  public Coordinate(Coordinate c){
    x = c.x;
    y = c.y;
  }

  public void setCoordinateToZero(){
    x = 0;
    y = 0;
    sector = 0;
  }
}
