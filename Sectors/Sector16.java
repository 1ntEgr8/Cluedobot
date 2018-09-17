package Sectors;
import Gameplay.Sector;
import Gameplay.Coordinate;

public class Sector16 extends Sector{
  public Sector16(){
    sectorMatrix = new int[3][2];
    criticalPos = new Coordinate[5];
    criticalPos[0] = new Coordinate(0,0,9,6,0,"Forward");
    criticalPos[1] = new Coordinate(0,1,9,6,1,"Forward");
    criticalPos[2] = new Coordinate(2,0,17,0,0,"Back");
    criticalPos[3] = new Coordinate(2,0,20,4,0,"Left");
    criticalPos[4] = new Coordinate(2,1,17,0,1,"Back");
    nearbyLoc = new String[4];
    nearbyLoc[0] = "Library";
    nearbyLoc[1] = "Study";
    nearbyLoc[2] = "Hall";
    nearbyLoc[3] = "Billiard Room";
    contactSectors = new int[]{9,17,20};
    door = new Coordinate[1];
    door[0] = new Coordinate(1,1,"Library");
  }
}
