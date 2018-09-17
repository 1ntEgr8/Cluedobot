package Sectors;
import Gameplay.Sector;
import Gameplay.Coordinate;

public class Sector18 extends Sector{
  public Sector18(){
    sectorMatrix = new int[3][2];
    criticalPos = new Coordinate[2];
    criticalPos[0] = new Coordinate(0,0,17,2,0,"Forward");
    criticalPos[1] = new Coordinate(0,1,17,2,1,"Forward");
    nearbyLoc = new String[3];
    nearbyLoc[0] = "Study";
    nearbyLoc[1] = "Library";
    nearbyLoc[2] = "Study";
    contactSectors = new int[]{17};
  }
}
