package Gameplay;
import Sectors.*;
import Gameplay.*;
import GameList.Item;
import java.util.Vector;
import java.util.Random;

class Dirval{
  String value;

  Dirval(String s){
    value = new String();
    value = s;
  }
}

class SectorTrans{
  int sectorTrans[];
  int noOfElements;

  SectorTrans(){
    sectorTrans = new int[100];
    for(int i = 0; i<sectorTrans.length; i++){
      sectorTrans[i] = 0;
    }
    noOfElements = 0;
  }

}

public class PositioningSystem{
  Sector activeSector;
  public Sector tempSector;
  public int currentSector;
  public int destSector;
  public int currentSectorTrans[]; // CHANGE THIS !!!!!
  int kindex;  // used in sector transiton path development
  int jindex;  // used for the tempContactSector array
  int kindextrue;  // used for determination of bound to sectorTrans
  int dirindex;
  int dirinsize;
  public int suggNeeded;
  public int flag;
  public int flag2;
  public int m;
  int noOfTrans;
  String moveTowards;
  Random r = new Random();
  Coordinate currentCoordinate;
  Coordinate c; // used for passing coordinates during direction determination
  Dirval ddirections[] = new Dirval[50];
  Vector<Dirval> directions = new Vector<Dirval>();
  Vector<SectorTrans> trans = new Vector<SectorTrans>();
  Vector<Integer> destSectorArr = new Vector<Integer>();

  Sector1 s1;
  Sector2 s2;
  Sector3 s3;
  Sector4 s4;
  Sector5 s5;
  Sector6 s6;
  Sector7 s7;
  Sector8 s8;
  Sector9 s9;
  Sector10 s10;
  Sector11 s11;
  Sector12 s12;
  Sector13 s13;
  Sector14 s14;
  Sector15 s15;
  Sector16 s16;
  Sector17 s17;
  Sector18 s18;
  Sector19 s19;
  Sector20 s20;

  public PositioningSystem(){
    currentSector = 3;
    currentSectorTrans = new int[20];
    kindex = 0;
    jindex = 0;
    for(int i = 0; i<currentSectorTrans.length; i++){
      currentSectorTrans[i] = 0;
    }

    currentCoordinate = new Coordinate(0,0);
    c = new Coordinate();

    noOfTrans = 0;
    m = 0;

    dirindex = 0;
  }

  /*

  ORDER OF CALLING OF FUCNTIONS

  1. createSectorObjects()
  2. assignSectorObjects()
  3. calcMoveTowards()
  4. determineDestinationSector()
  5. calcSectorTrans()

  */

  public void createSectorObjects(){
    /*
    This function creates sector objects that will be used to assign
    variables like tempSector, activeSector...
    */
    s1 = new Sector1();
    s2 = new Sector2();
    s3 = new Sector3();
    s4 = new Sector4();
    s5 = new Sector5();
    s6 = new Sector6();
    s7 = new Sector7();
    s8 = new Sector8();
    s9 = new Sector9();
    s10 = new Sector10();
    s11 = new Sector11();
    s12 = new Sector12();
    s13 = new Sector13();
    s14 = new Sector14();
    s15 = new Sector15();
    s16 = new Sector16();
    s17= new Sector17();
    s18 = new Sector18();
    s19 = new Sector19();
    s20 = new Sector20();
  }

  public void assignSectorObjects(){
    /*
    This assigns activeSector the appropriate sector object based on the value
    of currentSector
    */

    switch(currentSector){
      case 1: {activeSector = s1; break;
      }
      case 2: {activeSector = s2; break;
      }
      case 3: {activeSector = s3; break;
      }
      case 4: {activeSector = s4; break;
      }
      case 5: {activeSector = s5; break;
      }
      case 6: {activeSector = s6; break;
      }
      case 7: {activeSector = s7; break;
      }
      case 8: {activeSector = s8; break;
      }
      case 9: {activeSector = s9; break;
      }
      case 10: {activeSector = s10; break;
      }
      case 11: {activeSector = s11; break;
      }
      case 12: {activeSector = s12; break;
      }
      case 13: {activeSector = s13; break;
      }
      case 14: {activeSector = s14; break;
      }
      case 15: {activeSector = s15; break;
      }
      case 16: {activeSector = s16; break;
      }
      case 17: {activeSector = s17; break;
      }
      case 18: {activeSector = s18; break;
      }
      case 19: {activeSector = s19; break;
      }
      case 20: {activeSector = s20; break;
      }
    }
  }

  public void assignSectorObjects(int x){
    /*
    This overloads the assignSectorObjects() function
    It assigns tempSector the appropriate sector object based on what value
    is passed to the formal argument x
    */
    switch(x){
      case 1: { tempSector = s1; break;
      }
      case 2: { tempSector = s2; break;
      }
      case 3: { tempSector = s3; break;
      }
      case 4: { tempSector = s4; break;
      }
      case 5: { tempSector = s5; break;
      }
      case 6: { tempSector = s6; break;
      }
      case 7: { tempSector = s7; break;
      }
      case 8: { tempSector = s8; break;
      }
      case 9: { tempSector = s9; break;
      }
      case 10: { tempSector = s10; break;
      }
      case 11: { tempSector = s11; break;
      }
      case 12: { tempSector = s12; break;
      }
      case 13: { tempSector = s13; break;
      }
      case 14: { tempSector = s14; break;
      }
      case 15: { tempSector = s15; break;
      }
      case 16: { tempSector = s16; break;
      }
      case 17: { tempSector = s17; break;
      }
      case 18: { tempSector = s18; break;
      }
      case 19: { tempSector = s19; break;
      }
      case 20: { tempSector = s20; break;
      }
    }
  }

  public void assignContactSector(int x, int arr[]){
    /*
    This function copies the values of the contactSector array of the sector obejct
    chosen into arr[] with the help of the assignElementsIntoArray()
    */
    switch(x){
      case 1: {assignElementsIntoArray(s1.contactSectors,arr); break;
      }
      case 2: {assignElementsIntoArray(s2.contactSectors,arr); break;
      }
      case 3: {assignElementsIntoArray(s3.contactSectors,arr); break;
      }
      case 4: {assignElementsIntoArray(s4.contactSectors,arr); break;
      }
      case 5: {assignElementsIntoArray(s5.contactSectors,arr); break;
      }
      case 6: {assignElementsIntoArray(s6.contactSectors,arr); break;
      }
      case 7: {assignElementsIntoArray(s7.contactSectors,arr); break;
      }
      case 8: {assignElementsIntoArray(s8.contactSectors,arr); break;
      }
      case 9: {assignElementsIntoArray(s9.contactSectors,arr); break;
      }
      case 10: {assignElementsIntoArray(s10.contactSectors,arr); break;
      }
      case 11: {assignElementsIntoArray(s11.contactSectors,arr); break;
      }
      case 12: {assignElementsIntoArray(s12.contactSectors,arr); break;
      }
      case 13: {assignElementsIntoArray(s13.contactSectors,arr); break;
      }
      case 14: {assignElementsIntoArray(s14.contactSectors,arr); break;
      }
      case 15: {assignElementsIntoArray(s15.contactSectors,arr); break;
      }
      case 16: {assignElementsIntoArray(s16.contactSectors,arr); break;
      }
      case 17: {assignElementsIntoArray(s17.contactSectors,arr); break;
      }
      case 18: {assignElementsIntoArray(s18.contactSectors,arr); break;
      }
      case 19: {assignElementsIntoArray(s19.contactSectors,arr); break;
      }
      case 20: {assignElementsIntoArray(s20.contactSectors,arr); break;
      }
    }
  }

  public void determineDestinationSector(){
    /*
    This function uses the calcDestinationSector() function to determine the
    destination sector
    It then changed the first element of the sectorTrans[] array to destSector
    */
      calcDestinationSector(s2.door,2);
      calcDestinationSector(s3.door,3);
      calcDestinationSector(s4.door,4);
      calcDestinationSector(s6.door,6);
      calcDestinationSector(s7.door,7);
      calcDestinationSector(s8.door,8);
      calcDestinationSector(s9.door,9);
      calcDestinationSector(s10.door,10);
      calcDestinationSector(s15.door,15);
      calcDestinationSector(s16.door,16);
      calcDestinationSector(s17.door,17);
      calcDestinationSector(s20.door,20);
      destSector = destSectorArr.get(r.nextInt(destSectorArr.size()));
      trans.addElement(new SectorTrans());
      addElementToSectorTrans(destSector);
      destSectorArr.removeAllElements();
    }

  public void assignElementsIntoArray(int arr1[], int arr2[]){
    /*
    This function copies the values of array 1 into array 2
    */
    jindex = 0;
    for(int i = 0; i<arr1.length; i++){
      arr2[i] = arr1[i];
      jindex++;
    }
  }

  public void calcMoveTowards(Item checkList[]){
    /*
    This function determones the location to which Cluedobot shoud move to.
    It assigns the moveTowards member variable in this process
    */
    String options[] = new String[20];
    String updateOptions[] = new String[3];
    int j = 0, l = 0, flag = 0;
    for(int i = 0; i<checkList.length; i++){
      if(checkList[i].getHave() == false ){
        options[j++] = checkList[i].getName();
      }
    }

    for(int i = 0; i<j; i++){
      for(int k = 0; k<activeSector.nearbyLoc.length; k++){
        if(options[i].equals(activeSector.nearbyLoc[k])){
          updateOptions[l++] = options[i];
          flag = 1;
          break;
        }
      }
    }
    if(flag == 0){
      j = r.nextInt(j);
      moveTowards = options[j];
    }
    else{
      j = r.nextInt(l);
      moveTowards = updateOptions[j];
    }

    System.out.println(moveTowards);
  }

  public void calcDestinationSector(Coordinate c[], int sector){
    /*
    This function determines the destination sector value
    This value is assigned to destSector
    */
    for(int i = 0; i<c.length; i++){
      if(moveTowards.equals(c[i].opensTo)){
        destSectorArr.addElement(sector);
        break;
      }
    }
  }

  public void calcSectorTrans(int current, int previous){
    /*
    This function assigns the sectorTrans array with the help of recursion
    */
    int loop = 1;  // used for determination of alternate route
    int no;
    int tempContactSector[] =  new int[6];
    System.out.println("value of current: " + current);
    System.out.println("value of previous: " + previous);

    // initailizing array elements
    for(int i = 0; i<tempContactSector.length; i++){
      tempContactSector[i] = 0;
    }

    assignContactSector(current,tempContactSector);
    no = jindex;

    for(int i = 0; i<no; i++){
      System.out.println("VALUE OF TEMPCONTACTSECTOR{I}: " + tempContactSector[i] + "current: " + current);
      System.out.println("PREVIOUs: " + previous);

      if(tempContactSector[i] == previous){
        if(kindex > 1 && no == 1){
          kindex = kindex - 1;
          continue;
        }
        System.out.println("repeat : KINDEX: " + kindex);
        System.out.println("REPEAT: BREAK FROM LOOP");
        continue;
      }

      if(loop == -1 && flag == 1){
        if(flag == 0){
          trans.removeElementAt(noOfTrans);
          kindex = 0;
        }
        System.out.print("EXECUTED");
        trans.addElement(new SectorTrans());
        for(int j = 0; trans.get(noOfTrans-1).sectorTrans[j] != current; j++){
          addElementToSectorTrans(trans.get(noOfTrans-1).sectorTrans[j]);
        }
        addElementToSectorTrans(current);
        flag = 0;
      }

      if(tempContactSector[i] == destSector){
        flag2 = 1;
      }

      if((current == 4 || current == 9 || current == 16 || current == 8 ) && flag == 0){
        loop *= -1;
        System.out.println("LOOP VALUE CHANEGD: " + loop);
      }

      if(tempContactSector[i] == currentSector){
        addElementToSectorTrans(currentSector);
        trans.get(noOfTrans).noOfElements = kindex;
        System.out.println("KINDEX VALUE" + kindex);
        kindex = 0;
        flag = 1;
        noOfTrans++;
        break;
      }
      else if(flag2 == 1){
        if(m>1){
          break;
        }
        else{
        flag2 = 0;
        i = i-1;
        }
      }
      else if(flag == 1 && m == 0){
        if(i == no){
          break;
        }
      }
      else if(flag == 1 && loop == 1){
        System.out.println("BREAK FROM LOOP");
        break;
      }
      else{
        addElementToSectorTrans(tempContactSector[i]);
        System.out.println("FUNCTION CALLED");
        m++;
        System.out.println("m: " + m );
        calcSectorTrans(tempContactSector[i], current);
      }
    System.out.println("i = " + i + " , no = " + no );
    }

    System.out.println("LOOP TERMINATED");
    m--;
  }

  public void searchCoordinate(int currSector, int nextSector){
    /*
    This function searches the exit point to transition to the next sector
    */
    assignSectorObjects(currSector);

    for(int i = 0; i<tempSector.criticalPos.length; i++){
      if(tempSector.criticalPos[i].sector == nextSector){
        c = tempSector.criticalPos[i];
        break;
      }
    }

    System.out.print("EXIT POINT: " + c.x + " " + c.y + "\n");
  }

  public void createDirections(Coordinate start, Coordinate dest){
    /*
    This function adds directions to the diections vector
    The vector can only take in the objects of Dirval
    */
    int side = 0;
    int front = 0;
    front = start.x - dest.x;
    side = dest.y - start.y;

    System.out.print("FRONT: " + front + " SIDE: " + side + "\n");

    if(side>0){
      for(int i = 0; i<side; i++)
        directions.addElement(new Dirval("Right"));
    }
    else if(side<0){
      for(int i = 0; i<(-1)*side; i++)
      directions.addElement(new Dirval("Left"));

    }

    if(front>0){
      for(int i = 0; i<front; i++)
      directions.addElement(new Dirval("Forward"));

    }
    else if(front<0){
      for(int i = 0; i<(-1)*front; i++)
      directions.addElement(new Dirval("Back"));
    }
  }

  public void assignDirectionsArray(){
    /*
    This function calls searchCoordinate(), createDirections() function in
    order to determine the directions to move to the desired destination
    */
    Coordinate tempCoordinate = new Coordinate(currentCoordinate);
    int tempCurrSector = currentSector;
    System.out.print("CURRENT COORDINATE:" + currentCoordinate.x + " " + currentCoordinate.y + "\n");
    System.out.println("NEXT SECTOR VALUE:" + currentSectorTrans[kindextrue-2] + "\n");
    for(int i = kindextrue-2; i>=0; i--){
      System.out.println(tempCurrSector + ", " + currentSectorTrans[i]);
      searchCoordinate(tempCurrSector,currentSectorTrans[i]);
      createDirections(tempCoordinate,c);
      tempCurrSector = currentSectorTrans[i];
      tempCoordinate.x = c.linkx;
      tempCoordinate.y = c.linky;
      System.out.println(c.movDirection);
      directions.addElement(new Dirval(c.movDirection));
      System.out.println();
      System.out.print("NEW COORDINATES:" + tempCoordinate.x + " " + tempCoordinate.y + "\n");
    }

    assignSectorObjects(tempCurrSector);
    createDirections(tempCoordinate,tempSector.door[r.nextInt(tempSector.door.length)]);
    c.setCoordinateToZero();
    System.out.print("CURRENT COORDINATE:" + currentCoordinate.x + " " + currentCoordinate.y + "\n");
  }

  public void creatDirectionsArray(){
    /*
    This function assigns the values stored in he directions Vector
    into an array of Strings and then displays the directions
    It then empties the directions Vector
    */
    directions.copyInto(ddirections);
    dirindex = 0;
    dirinsize = directions.size();
    directions.removeAllElements();
  }

  public void dispSectorTrans(){
    /*
    This function displays the values stored in the sectorTrans arrray from
    index kindextrue-1 to 0
    */
    for(int i = kindextrue-1; i>=0; i--){
      System.out.print(currentSectorTrans[i] + " ");
    }
    System.out.println();
  }

  public void addElementToSectorTrans(int x){
    /*
    This function adds an element into the sectorTrans array of the current
    Vector object being used
    */
    trans.get(noOfTrans).sectorTrans[kindex++] = x;
    System.out.println("VALUE OF KINDEX: " + kindex);
    System.out.println("VALEU ADDED: " + trans.get(noOfTrans).sectorTrans[kindex-1]);
  }

  public void alterSectorTrans(){

    int flag = 0,k = 0;
    for(int i = 0; i<noOfTrans; i++){
      for(int j = 0; j<trans.get(i).noOfElements - 1; j++){
        flag = 0;
        assignSectorObjects(trans.get(i).sectorTrans[j]);
        for(k = 0; k<tempSector.contactSectors.length; k++){
          if(tempSector.contactSectors[k] == trans.get(i).sectorTrans[j+1]){
            flag = 1;
            break;
          }
        }
        if(flag == 0){
          for(int l = k; l<trans.get(i).noOfElements-1; l++){
            trans.get(i).sectorTrans[l] = trans.get(i).sectorTrans[l+1];
          }
          trans.get(i).noOfElements--;
          j = j-2;
        }
      }
    }
  }

  public void addElementsToCurrentTrans(){
    int j;
    j = r.nextInt(noOfTrans);
    kindextrue = 0;
    System.out.println("NO OF TRANS:" + noOfTrans);
    System.out.println(j);
    kindextrue = trans.get(j).noOfElements;
    System.out.println("VALUE OF KINDEX:" + kindextrue);

    for(int i = 0; i<noOfTrans; i++){
      System.out.println("TRANS " + (i+1));
      for(int k = 0; k<trans.get(i).noOfElements; k++){
        System.out.println(trans.get(i).sectorTrans[k]);
      }
    }

    for(int i = 0; i<kindextrue; i++){
      currentSectorTrans[i] = trans.get(j).sectorTrans[i];
    }
  }

   public void clearTrans(){
     noOfTrans = 0;
     trans.removeAllElements();
     kindex = 0;
     System.out.print("KINDEX VALUE:" + kindex);
   }

   /**************************************************************************/

   public void move(int dieRoll){

     for(int i = 0; i<dieRoll; i++){
       assignSectorObjects(currentSector);
       if(dirindex == dirinsize){
         suggNeeded = 1;
         dirindex = 0;
         break;
       }
       System.out.println(ddirections[dirindex].value);
       if(checkForSectorChange()){
         dirindex++;
       }
       else{
           if(ddirections[dirindex].value.equals("Right")){
             currentCoordinate.y++;
           }
           else if(ddirections[dirindex].value.equals("Left")){
             currentCoordinate.y--;
           }
           else if(ddirections[dirindex].value.equals("Forward")){
             currentCoordinate.x--;
           }
           else if(ddirections[dirindex].value.equals("Back")){
             currentCoordinate.x++;
           }
        dirindex++;
      }
     }
   }

   // ************************************************************************//



public boolean checkForSectorChange(){
  int flag = 0;
  System.out.println("Current sector: " + currentSector);
  System.out.println("critical pos sec 1: " + tempSector.criticalPos[0].sector);
  for(int i = 0; i<tempSector.criticalPos.length; i++){
    if(flag == 0){
      System.out.println("CURRENT COORDINATE:" + "(" + currentCoordinate.x + "," + currentCoordinate.y + ")");
      System.out.println("Critical COORDINATE:" + "(" + tempSector.criticalPos[i].x + "," + tempSector.criticalPos[i].y + ")");
      if((currentCoordinate.x == tempSector.criticalPos[i].x && currentCoordinate.y == tempSector.criticalPos[i].y) && (ddirections[dirindex].value.equals(tempSector.criticalPos[i].movDirection)) || (tempSector.criticalPos[i].x == 0 && tempSector.criticalPos[i].y == 0 && currentSectorTrans[kindextrue-1] == destSector)){
        System.out.println(kindextrue);
        for(int j = 1; j<=kindextrue; j++){
          System.out.println("crtical pos sec " + tempSector.criticalPos[i].sector);
          System.out.println("CURRENTSECTORTRANS[j] = " + currentSectorTrans[j]);
          System.out.println("next sector = " + currentSectorTrans[j-1]);
          if(currentSectorTrans[j] == currentSector){
            System.out.print("true1\n");
            if(currentSectorTrans[j-1] == tempSector.criticalPos[i].sector){
              currentSector = currentSectorTrans[j-1];
              currentCoordinate.x = tempSector.criticalPos[i].linkx;
              currentCoordinate.y = tempSector.criticalPos[i].linky;
              System.out.println("NEW CUR COORD:" + "(" + currentCoordinate.x + "," + currentCoordinate.y + ")");
              flag = 1;
              System.out.println("EXCECUTED");
              break;
            }
          }
        }
      }
    }
    else{
      break;
    }
  }
  if(flag == 1){
    return true;
  }
  else{
    return false;
  }
}

   public boolean checkForEquality(Coordinate c1, Coordinate c2){
     if(c1.x == c2.x && c1.y == c2.y)
       return true;
     else
     return false;
   }

}
