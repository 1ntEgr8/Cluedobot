package GameList;
import GameList.Item;

public class Lists{
  public Item characterList[];
  public Item weaponList[];
  public Item locationList[];

  public void createLists(){
    characterList = new Item[6];
    weaponList = new Item[6];
    locationList = new Item[9];
    //creation of objects
    for(int i = 0; i<characterList.length; i++){
      characterList[i] = new Item();
    }
    for(int i = 0; i<weaponList.length; i++){
      weaponList[i] = new Item();
    }
    for(int i = 0; i<locationList.length; i++){
      locationList[i] = new Item();
    }
  //Input of character values
  characterList[0].setValue("Miss Scarlet",54528);
  characterList[1].setValue("Professor Plum",20845);
  characterList[2].setValue("Mrs. Peacock",82075);
  characterList[3].setValue("Mr. Green",25425);
  characterList[4].setValue("Colonel Mustard",30152);
  characterList[5].setValue("Mrs. White",60149);
  //Input of weapon values
  weaponList[0].setValue("Candlestick",74382);
  weaponList[1].setValue("Dagger",81986);
  weaponList[2].setValue("Lead Pipe",63700);
  weaponList[3].setValue("Revolver",60530);
  weaponList[4].setValue("Rope",29336);
  weaponList[5].setValue("Spanner",22689);
  //Input of location values
  locationList[0].setValue("Kitchen",35993);
  locationList[1].setValue("Ballroom",99470);
  locationList[2].setValue("Conservatory",71602);
  locationList[3].setValue("Dining Room",19185);
  locationList[4].setValue("Lounge",85214);
  locationList[5].setValue("Hall",98461);
  locationList[6].setValue("Study",93983);
  locationList[7].setValue("Billiard Room",14631);
  locationList[8].setValue("Library",40219);
    }

  public void createChecklist(int code[]){
    // checking off characters,weapons and locations
    for(int i = 0; i<code.length; i++){
      for(int j = 0; j<characterList.length; j++){
        if(code[i] == characterList[j].getCode()){
          characterList[j].checkOff();
        }
      }
      for(int j = 0; j<weaponList.length; j++){
        if(code[i] == weaponList[j].getCode()){
          weaponList[j].checkOff();
        }
      }
      for(int j = 0; j<locationList.length; j++){
        if(code[i] == locationList[j].getCode()){
          locationList[j].checkOff();
        }
      }
    }
  }
}
