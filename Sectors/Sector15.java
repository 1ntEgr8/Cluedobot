package Sectors;
import Gameplay.Sector;
import Gameplay.Coordinate;

public class Sector15 extends Sector{
  public Sector15(){
    sectorMatrix = new int[1][5];
    criticalPos = new Coordinate[1];
    criticalPos[0] = new Coordinate(0,0,9,3,2,"Left");
    nearbyLoc = new String[6];
    nearbyLoc[0] = "Library";
    nearbyLoc[1] = "Study";
    nearbyLoc[2] = "Conservatory";
    nearbyLoc[3] = "Billiard Room";
    nearbyLoc[4] = "Ballroom";
    nearbyLoc[5] = "Hall";
    contactSectors = new int[]{9};
    door = new Coordinate[2];
    door[0] = new Coordinate(0,4,"Billiard Room");
    door[1] = new Coordinate(0,2,"Library");
  }
}
