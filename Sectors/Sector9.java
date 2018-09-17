package Sectors;
import Gameplay.Sector;
import Gameplay.Coordinate;

public class Sector9 extends Sector{
  public Sector9(){
    sectorMatrix = new int[7][3];
    criticalPos = new Coordinate[7];
    criticalPos[0] = new Coordinate(0,0,8,0,6,"Left");
    criticalPos[1] = new Coordinate(1,0,8,1,6,"Left");
    criticalPos[2] = new Coordinate(0,1,10,2,0,"Forward");
    criticalPos[3] = new Coordinate(0,2,10,2,1,"Forward");
    criticalPos[4] = new Coordinate(5,2,15,0,0,"Right");
    criticalPos[5] = new Coordinate(6,0,16,0,0,"Back");
    criticalPos[6] = new Coordinate(6,1,16,0,1,"Back");
    nearbyLoc = new String[4];
    nearbyLoc[0] = "Library";
    nearbyLoc[1] = "Dining Room";
    nearbyLoc[2] = "Conservatory";
    nearbyLoc[3] = "Billiard Room";
    contactSectors = new int[]{8,10,15,16};
    door = new Coordinate[1];
    door[0] = new Coordinate(1,2,"Billiard Room");
  }
}
