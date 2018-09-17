package Sectors;
import Gameplay.Sector;
import Gameplay.Coordinate;

public class Sector17 extends Sector{
  public Sector17(){
    sectorMatrix = new int[3][3];
    criticalPos = new Coordinate[6];
    criticalPos[0] = new Coordinate(0,0,16,2,0,"Forward");
    criticalPos[1] = new Coordinate(0,1,16,2,1,"Forward");
    criticalPos[2] = new Coordinate(1,2,19,0,0,"Right");
    criticalPos[3] = new Coordinate(2,2,19,1,0,"Right");
    criticalPos[4] = new Coordinate(2,0,18,0,0,"Back");
    criticalPos[5] = new Coordinate(2,1,18,0,1,"Back");
    nearbyLoc = new String[4];
    nearbyLoc[0] = "Library";
    nearbyLoc[1] = "Hall";
    nearbyLoc[2] = "Study";
    nearbyLoc[3] = "Billiard Room";
    contactSectors = new int[]{16,18,19};
    door = new Coordinate[2];
    door[0] = new Coordinate(2,0,"Hall");
    door[1] = new Coordinate(0,2,"Study");

  }
}
