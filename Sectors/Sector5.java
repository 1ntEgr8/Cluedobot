package Sectors;
import Gameplay.Sector;
import Gameplay.Coordinate;

public class Sector5 extends Sector{
  public Sector5(){
    sectorMatrix = new int[3][3];
    criticalPos = new Coordinate[6];
    criticalPos[0] = new Coordinate(0,0,6,0,3,"Left");
    criticalPos[1] = new Coordinate(1,0,6,1,3,"Left");
    criticalPos[2] = new Coordinate(0,1,7,4,0,"Forward");
    criticalPos[3] = new Coordinate(0,2,7,4,1,"Forward");
    criticalPos[4] = new Coordinate(1,2,8,0,0,"Right");
    criticalPos[5] = new Coordinate(2,2,8,1,0,"Right");
    nearbyLoc = new String[3];
    nearbyLoc[0] = "Kitchen";
    nearbyLoc[1] = "Ballroom";
    nearbyLoc[2] = "Dining Room";
    contactSectors = new int[]{6,7,8};
  }
}
