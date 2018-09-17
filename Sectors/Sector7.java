package Sectors;
import Gameplay.Sector;
import Gameplay.Coordinate;

public class Sector7 extends Sector{
  public Sector7(){
    sectorMatrix = new int[5][2];
    criticalPos = new Coordinate[3];
    criticalPos[0] = new Coordinate(0,1,11,0,0,"Forward");
    criticalPos[1] = new Coordinate(4,0,5,0,1,"Back");
    criticalPos[2] = new Coordinate(4,1,5,0,2,"Back");
    nearbyLoc = new String[3];
    nearbyLoc[0] = "Kitchen";
    nearbyLoc[1] = "Ballroom";
    nearbyLoc[2] = "Dining Room";
    contactSectors = new int[]{5};
    door = new Coordinate[1];
    door[0] = new Coordinate(3,1,"Ballroom");
  }
}
