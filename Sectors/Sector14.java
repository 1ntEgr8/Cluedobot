package Sectors;
import Gameplay.Sector;
import Gameplay.Coordinate;

public class Sector14 extends Sector{
  public Sector14(){
    sectorMatrix = new int[2][4];
    criticalPos = new Coordinate[2];
    criticalPos[0] = new Coordinate(0,0,10,1,2,"Left");
    criticalPos[1] = new Coordinate(1,0,10,2,2,"Left");
    nearbyLoc = new String[3];
    nearbyLoc[0] = "Ballroom";
    nearbyLoc[1] = "Conservatory";
    nearbyLoc[2] = "Billiard Room";
    contactSectors = new int[]{10};
  }
}
