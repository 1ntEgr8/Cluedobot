package Sectors;
import Gameplay.Sector;
import Gameplay.Coordinate;

public class Sector4 extends Sector{
  public Sector4(){
    sectorMatrix = new int[8][2];
    criticalPos = new Coordinate[6];
    criticalPos[0] = new Coordinate(0,0,8,1,0,"Forward");
    criticalPos[1] = new Coordinate(0,1,8,1,1,"Forward");
    criticalPos[2] = new Coordinate(6,0,3,0,6,"Left");
    criticalPos[3] = new Coordinate(7,0,3,1,6,"Left");
    criticalPos[4] = new Coordinate(7,0,2,0,7,"Back");
    criticalPos[5] = new Coordinate(7,1,20,0,0,"Right");
    nearbyLoc = new String[5];
    nearbyLoc[0] = "Lounge";
    nearbyLoc[1] = "Hall";
    nearbyLoc[2] = "Dining Room";
    nearbyLoc[3] = "Kitchen";
    nearbyLoc[4] = "Ballroom";
    contactSectors = new int[]{2,3,8,20};
    door = new Coordinate[1];
    door[0] = new Coordinate(2,0,"Dining Room");
  }
}
