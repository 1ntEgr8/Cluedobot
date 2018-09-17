package Sectors;
import Gameplay.Sector;
import Gameplay.Coordinate;

public class Sector19 extends Sector{
  public Sector19(){
    sectorMatrix = new int[2][5];
    criticalPos = new Coordinate[2];
    criticalPos[0] = new Coordinate(0,0,17,1,2,"Left");
    criticalPos[1] = new Coordinate(1,0,17,2,2,"Left");
    nearbyLoc = new String[3];
    nearbyLoc[0] = "Library";
    nearbyLoc[1] = "Study";
    nearbyLoc[2] = "Hall";
    contactSectors = new int[]{17};
  }
}
