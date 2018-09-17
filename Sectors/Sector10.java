package Sectors;
import Gameplay.Sector;
import Gameplay.Coordinate;

public class Sector10 extends Sector{
  public Sector10(){
    sectorMatrix = new int[3][3];
    criticalPos = new Coordinate[6];
    criticalPos[0] = new Coordinate(0,0,13,2,0,"Forward");
    criticalPos[1] = new Coordinate(0,1,13,2,1,"Forward");
    criticalPos[2] = new Coordinate(1,2,14,0,0,"Right");
    criticalPos[3] = new Coordinate(2,2,14,1,0,"Right");
    criticalPos[4] = new Coordinate(2,0,9,0,1,"Back");
    criticalPos[5] = new Coordinate(2,1,9,0,2,"Back");
    nearbyLoc = new String[3];
    nearbyLoc[0] = "Ballroom";
    nearbyLoc[1] = "Conservatory";
    nearbyLoc[2] = "Billiard Room";
    contactSectors = new int[]{9,13,14};
    door = new Coordinate[2];
    door[0] = new Coordinate(0,0,"Conservatory");
    door[1] = new Coordinate(0,2,"Ballroom");
  }
}
