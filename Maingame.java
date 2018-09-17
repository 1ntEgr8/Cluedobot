import Dice.Roll;
import GameList.Lists;
import GameList.Item;
import Input.Inp;
import Suggestions.Suggestion;
import Gameplay.PositioningSystem;

public class Maingame{
  public static void main(String args[]){
    int die;
    int noOfCards = 0;
    int ch = 0;
    int code[] = new int[30];  // array for getting the codes
    Inp in = new Inp();  // handles input
    Lists list = new Lists();  // checklist creation
    Roll dieroll = new Roll();  // rolls the die
    Suggestion sugg = new Suggestion();  // handles suggestion system
    PositioningSystem position = new PositioningSystem();  // deals with position
    in.welcomeScreen();
    noOfCards = in.inputCode();
    in.inputCodeMessage();
    for(int i = 0; i<noOfCards; i++){
      code[i] = in.inputCode();
    }
    System.out.println("Thank you!");
    System.out.println("Let me create my checklist now...");
    list.createLists();
    System.out.println("\nChecking Off Items...");
    list.createChecklist(code);

    System.out.println("\nCOMPLETE!");
    System.out.println("\nLets Play!");
    System.out.println("\nI'm Miss Scarlet and the rules of the game state that Miss Scarlet should begin play! WOO HOO!");
    System.out.println("I'm going to roll the die now...");
    System.out.println("The number sandwiched between the two lines is the number shown by my virtual die");
    System.out.println("After that you will see a set of instructions telling you where to move my piece");
    System.out.println("My piece has to be moved with respect to the initial position of Miss Scarlet");
    System.out.println("I will alert you whenever I realise I have entered a room");
    System.out.println("If I have not entered a room, I will prompt you to input any codes that other players reveal to possess");
    System.out.println("SOME MORE INSTRUCTIONS \n<press 1 to input codes>\n<press 2 to see my latest suggestion>\n<press 3 to see these INSTRUCTIONS>\n<press 4 to EXIT>");
    System.out.println("\n\nNow press any NUMBER to begin...");
    ch = in.inputCode();
    System.out.flush();

    do{
      in.dispMenu();
      ch = in.inputCode();

      switch(ch){
        case 1: {
          System.out.println("ENTER THE NUMBER OF CARDS:");
          noOfCards = in.inputCode();
          in.inputCodeMessage();
          for(int i = 0; i<noOfCards; i++){
            code[i] = in.inputCode();
          }
          System.out.println("Got it!!!");
          System.out.println("\nChecking Off Items...");
          list.createChecklist(code);
          position.createSectorObjects();
          position.assignSectorObjects();
          position.calcMoveTowards(list.locationList);
          position.determineDestinationSector();
          System.out.println(position.destSector);
          position.flag = 0;
          position.assignSectorObjects(position.destSector);
          position.calcSectorTrans(position.destSector, 0);
          position.addElementsToCurrentTrans();
          position.alterSectorTrans();
          position.addElementsToCurrentTrans();
          position.dispSectorTrans();
          position.assignDirectionsArray();
          position.creatDirectionsArray();
          position.clearTrans();
          position.m = 0;
          break;
        }
        case 2: {
          die = dieroll.roll();
          position.move(die);
          System.out.println(position.currentSector);
          if(position.suggNeeded == 1){
            in.suggMess();
            sugg.createSuggList();
            sugg.prepSuggOption(list.characterList, list.weaponList, list.locationList);
            sugg.dispSugg();
            position.suggNeeded = 0;
          }
          break;
        }
        case 3:{
          System.out.println("Not yet functional");
          break;
        }
      }

    }while(ch<=4);


  }
}
