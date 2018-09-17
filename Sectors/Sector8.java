package Sectors;
import Gameplay.Sector;
import Gameplay.Coordinate;

public class Sector8 extends Sector{
  public Sector8(){
    sectorMatrix = new int[2][7];
    criticalPos = new Coordinate[6];
    criticalPos[0] = new Coordinate(0,0,5,1,2,"Left");
    criticalPos[1] = new Coordinate(1,0,5,2,2,"Left");
    criticalPos[2] = new Coordinate(0,6,9,0,0,"Right");
    criticalPos[3] = new Coordinate(1,6,9,1,0,"Right");
    criticalPos[4] = new Coordinate(1,0,4,0,0,"Back");
    criticalPos[5] = new Coordinate(1,1,4,0,1,"Back");
    nearbyLoc = new String[5];
    nearbyLoc[0] = "Kitchen";
    nearbyLoc[1] = "Ballroom";
    nearbyLoc[2] = "Dining Room";
    nearbyLoc[3] = "Conservatory";
    nearbyLoc[4] = "Billiard Room";
    contactSectors = new int[]{4,5,9};
    door = new Coordinate[2];
    door[0] = new Coordinate(0,1,"Ballroom");
    door[1] = new Coordinate(0,6,"Ballroom");
  }
}
