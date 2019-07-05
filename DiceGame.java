import java.util.Random;

class Die {
  private int faceValue;

  public int getFaceValue(){
    return faceValue;
  }
  public void roll(){
    faceValue = (int)(Math.random()*5) + 1;
  }
}

public class DiceGame {
  Die die1 = new Die();
  Die die2 = new Die();

  public void play(){
    int fv1;
    int fv2;
    die1.roll();
    fv1 = die1.getFaceValue();
    die2.roll();
    fv2 = die2.getFaceValue();
    System.out.println("Rolling the dice...");
    System.out.println("Die 1: "+fv1);
    System.out.println("Die 2: "+fv2);
    System.out.println("Total value: "+(fv1 + fv2));
    if((fv1 + fv2) >= 7) {
      System.out.println("You won");
    }
    else {
      System.out.println("You lost");
    }
  }

  public static void main(String[] args){
    DiceGame dice = new DiceGame();
    dice.play();
  }
}
