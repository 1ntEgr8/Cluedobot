package Sectors;
import Gameplay.Sector;
import Gameplay.Coordinate;

public class Sector13 extends Sector{
  public Sector13(){
    sectorMatrix = new int[3][2];
    criticalPos = new Coordinate[3];
    criticalPos[0] = new Coordinate(0,0,12,0,2,"Forward");
    criticalPos[1] = new Coordinate(2,0,10,0,0,"Back");
    criticalPos[2] = new Coordinate(2,1,10,0,1,"Back");
    nearbyLoc = new String[3];
    nearbyLoc[0] = "Ballroom";
    nearbyLoc[1] = "Conservatory";
    nearbyLoc[2] = "Billiard Room";
    contactSectors = new int[]{10,12};
  }
}
