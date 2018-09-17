package Sectors;
import Gameplay.Sector;
import Gameplay.Coordinate;

public class Sector20 extends Sector{
  public Sector20(){
    sectorMatrix = new int[1][5];
    criticalPos = new Coordinate[2];
    criticalPos[0] = new Coordinate(0,0,4,7,1,"Right");
    criticalPos[1] = new Coordinate(0,4,16,2,0,"Left");
    nearbyLoc = new String[6];
    nearbyLoc[0] = "Library";
    nearbyLoc[1] = "Dining Room";
    nearbyLoc[2] = "Hall";
    nearbyLoc[3] = "Billiard Room";
    nearbyLoc[4] = "Lounge";
    nearbyLoc[5] = "Study";
    contactSectors = new int[]{4,16};
    door = new Coordinate[2];
    door[0] = new Coordinate(0,1,"Hall");
    door[1] = new Coordinate(0,2,"Hall"); // Check this with your board
  }
}
