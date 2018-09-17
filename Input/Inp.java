package Input;
import java.util.Scanner;
import java.util.Random;

public class Inp{
  Scanner in = new Scanner(System.in);
  Random r = new Random();
  String inputMessages[] = new String[4];
  String suggMessages[] = new String[4];
  String menuOptions[] = new String[4];

  public Inp(){
    inputMessages[0] = "Input the codes";
    inputMessages[1] = "Nice! Now its time for you to input the codes";
    inputMessages[2] = "Ok... I'm in need of codes, so input it";
    inputMessages[3] = "You've got to input those codes now! DON'T MAKE A MISTAKE!";
    suggMessages[0] = "Time for my suggestion";
    suggMessages[1] = "Hmmm, I have to present my suggestion now";
    suggMessages[2] = "Great! It's suggestion time";
    suggMessages[3] = "Suggestion incoming";
    menuOptions[0] = "Menu";
    menuOptions[1] = "Here comes my Menu... Choose an option appropriately";
    menuOptions[2] = "Menu Incoming!";
    menuOptions[3] = "Navigation aid AKA MENU!";
  }
  public void welcomeScreen(){
    System.out.println("\n\nHey!");
    System.out.println("\nI'm Cluedobot");
    System.out.println("Let's begin play, if your'e done with setting up the board");
    System.out.println("\nSince I'm the computer player, I get to choose my character...");
    System.out.println("Why you ask? Well, that's because I'm the computer player, not you!");
    System.out.println("\nI'm Miss Scarlet");
    System.out.println("Deal me my cards, but DON'T LOOK AT THEM!");
    System.out.println("Just input the codes written on the outside of the cards");
    System.out.println("whenever I prompt");
    System.out.println("\nFor your information, the prompt is >>");
    System.out.println("\n\nBy the way, how many cards do I have?");
  }

  public void inputCodeMessage(){
    int i = r.nextInt(4);
    System.out.println(inputMessages[i]);
  }
  public int inputCode(){
  System.out.print(">>");
  int i = 0;
  i = in.nextInt();
  return i;
  }
  public void suggMess(){
    int i = r.nextInt(4);
    System.out.println(suggMessages[i]);
  }

  public void dispMenu(){
    int i = r.nextInt(4);
    System.out.print("\n\t\t");
    System.out.println(menuOptions[i]);
    System.out.println("\n\t\t<1>Input CODES");
    System.out.println("\t\t<2>View LATEST SUGGESTIONS");
    System.out.println("\t\t<3>HELP");
    System.out.println("\t\t<4>SWITCH OFF");
  }

}
