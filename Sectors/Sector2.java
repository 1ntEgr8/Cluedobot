package Sectors;
import Gameplay.Sector;
import Gameplay.Coordinate;

public class Sector2 extends Sector{
  public Sector2(){
    sectorMatrix = new int[1][8];
    criticalPos = new Coordinate[10];
    criticalPos[0] = new Coordinate(0,0,3,1,0,"Forward");
    criticalPos[1] = new Coordinate(0,1,3,1,1,"Forward");
    criticalPos[2] = new Coordinate(0,2,3,1,2,"Forward");
    criticalPos[3] = new Coordinate(0,3,3,1,3,"Forward");
    criticalPos[4] = new Coordinate(0,4,3,1,4,"Forward");
    criticalPos[5] = new Coordinate(0,5,3,1,5,"Forward");
    criticalPos[6] = new Coordinate(0,6,3,1,6,"Forward");
    criticalPos[7] = new Coordinate(0,7,4,7,0,"Forward");
    criticalPos[8] = new Coordinate(0,6,1,0,0,"Back");
    criticalPos[9] = new Coordinate(0,6,1,0,1,"Back");
    nearbyLoc = new String[3];
    nearbyLoc[0] = "Lounge";
    nearbyLoc[1] = "Hall";
    nearbyLoc[2] = "Dining Room";
    contactSectors = new int[]{1,3,4};
    door = new Coordinate[1];
    door[0] = new Coordinate(0,5,"Lounge");
  }
}
