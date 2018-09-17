package Sectors;
import Gameplay.Sector;
import Gameplay.Coordinate;

public class Sector11 extends Sector{
  public Sector11(){
    sectorMatrix = new int[1][3];
    criticalPos = new Coordinate[1];
    criticalPos[0] = new Coordinate(0,0,7,0,1,"Back");
    nearbyLoc = new String[3];
    nearbyLoc[0] = "Ballroom";
    nearbyLoc[1] = "Kitchen";
    nearbyLoc[2] = "Dining Room";
    contactSectors = new int[]{7};
  }
}
