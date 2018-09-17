package Sectors;
import Gameplay.Sector;
import Gameplay.Coordinate;

public class Sector6 extends Sector{
  public Sector6(){
    sectorMatrix = new int[2][4];
    criticalPos = new Coordinate[2];
    criticalPos[0] = new Coordinate(0,3,5,0,0,"Right");
    criticalPos[1] = new Coordinate(1,3,5,1,0,"Right");
    nearbyLoc = new String[3];
    nearbyLoc[0] = "Kitchen";
    nearbyLoc[1] = "Ballroom";
    nearbyLoc[2] = "Dining Room";
    contactSectors = new int[]{5};
    door = new Coordinate[1];
    door[0] = new Coordinate(0,3,"Kitchen");
  }
}
