package Sectors;
import Gameplay.Sector;
import Gameplay.Coordinate;

public class Sector12 extends Sector{
  public Sector12(){
    sectorMatrix = new int[1][3];
    criticalPos = new Coordinate[1];
    criticalPos[0] = new Coordinate(0,2,13,0,0,"Back");
    nearbyLoc = new String[3];
    nearbyLoc[0] = "Ballroom";
    nearbyLoc[1] = "Conservatory";
    nearbyLoc[2] = "Billiard Room";
    contactSectors = new int[]{13};
  }
}
