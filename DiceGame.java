import java.util.Random;
import java.util.Scanner;

class Player {
  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}

class Die {
  private int faceValue;

  public int getFaceValue() {
    return faceValue;
  }
  public void roll(){
    faceValue = (int)(Math.random()*5) + 1;
  }
}

public class DiceGame {
  Player player = new Player();
  Die die1 = new Die();
  Die die2 = new Die();

  public void play(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your name?");
    player.setName(scanner.next());
    System.out.println("Hello, "+ player.getName() +"!");

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
