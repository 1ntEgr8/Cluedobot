package Sectors;
import Gameplay.Sector;
import Gameplay.Coordinate;

public class Sector1 extends Sector{
  public Sector1(){
    sectorMatrix = new int[5][1];
    criticalPos = new Coordinate[2];
    criticalPos[0] = new Coordinate(0,0,2,0,6,"Forward");
    criticalPos[1] = new Coordinate(0,1,2,0,7,"Forward");
    nearbyLoc = new String[3];
    nearbyLoc[0] = "Lounge";
    nearbyLoc[1] = "Hall";
    nearbyLoc[2] = "Dining Room";
    contactSectors = new int[]{2};
  }
}
