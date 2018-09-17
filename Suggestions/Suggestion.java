package Suggestions;
import GameList.Item;
import java.util.Random;

public class Suggestion{
  public Item charSugg[] = new Item[6];
  public Item weapSugg[] = new Item[6];
  public Item locaSugg[] = new Item[9];
  int cha;
  int wea;
  int loc; // for counting the no of items in each suggestion list
  Random r = new Random();

  public void createSuggList(){
    for(int i = 0; i<charSugg.length; i++){
      charSugg[i] = new Item();
    }
    for(int i = 0; i<weapSugg.length; i++){
      weapSugg[i] = new Item();
    }
    for(int i = 0; i<locaSugg.length; i++){
      locaSugg[i] = new Item();
    }
  }

  public void prepSuggOption(Item ch[], Item we[], Item lo[]){
    cha = 0;
    wea = 0;
    loc = 0;
    for(int i = 0; i<ch.length; i++){
      if(!ch[i].getHave()){
        charSugg[cha++] = ch[i];
      }
    }
    for(int i = 0; i<we.length; i++){
      if(!we[i].getHave()){
        weapSugg[wea++] = we[i];
      }
    }
    for(int i = 0; i<lo.length; i++){
      if(!lo[i].getHave()){
        locaSugg[loc++] = lo[i];
      }
    }

  }

  public void dispSugg(){
     cha = r.nextInt(cha);
     wea = r.nextInt(wea);
     loc = r.nextInt(loc);

    if(cha == 0 && wea == 0 && loc == 0){
      System.out.println("Actually ... ITS ACCUSATION TIME");
      System.out.println("Here's my ACCUSATION");
    }
    System.out.println("******************");
    System.out.println("The crime was committed by " + charSugg[cha].getName() + " in the " + locaSugg[loc].getName() + " with a " + weapSugg[wea].getName());
    System.out.println("******************");
  }
}
