package Dice;
import java.util.Random;

public class Roll{
  int noOfFaces;
  char type;
  int val;
  Random rand = new Random();
  public Roll(){
    noOfFaces = 6;
    type = 'N';
  }

  public Roll(int n, char c){
    noOfFaces = n;
    if(c == 'c' || c == 'C'){
      if(n>26){
        System.out.println("INVALID NUMBER OF FACES... SETTING NO OF FACES TO 26");
        noOfFaces = 26;
      }
    }
    type = c;
  }

  public int roll(){
    if(type == 'n' || type == 'N'){
      System.out.println("---");
      val = (rand.nextInt(noOfFaces) + 1);
      System.out.println(" " + val);
      System.out.println("---");
      return val;
    }
    else
      { int n = rand.nextInt(noOfFaces) + 65;
        char c = (char)n;
        System.out.println(c);
        return(c);
      }

  }
}
