package Sectors;
import Gameplay.Sector;
import Gameplay.Coordinate;

public class Sector3 extends Sector{
  public Sector3(){
    sectorMatrix = new int[2][7];
    criticalPos = new Coordinate[9];
    criticalPos[0] = new Coordinate(1,0,2,0,0,"Back");
    criticalPos[1] = new Coordinate(1,1,2,0,1,"Back");
    criticalPos[2] = new Coordinate(1,2,2,0,2,"Back");
    criticalPos[3] = new Coordinate(1,3,2,0,3,"Back");
    criticalPos[4] = new Coordinate(1,4,2,0,4,"Back");
    criticalPos[5] = new Coordinate(1,5,2,0,5,"Back");
    criticalPos[6] = new Coordinate(1,6,2,0,6,"Back");
    criticalPos[7] = new Coordinate(1,6,4,7,0,"Right");
    criticalPos[8] = new Coordinate(0,6,4,6,0,"Right");
    nearbyLoc = new String[3];
    nearbyLoc[0] = "Lounge";
    nearbyLoc[1] = "Hall";
    nearbyLoc[2] = "Dining Room";
    contactSectors = new int[]{2,4};
    door = new Coordinate[1];
    door[0] = new Coordinate(0,5,"Dining Room");
  }
}
