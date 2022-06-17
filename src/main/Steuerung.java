package main;

import java.util.Scanner;

import entity.Person;

public class Steuerung {
  private Person polli;

  public Steuerung(){
    int eingabe = -1;
    polli = new Person();
    while(this.polli.aktiv()){
      System.out.println("Welches naechste Ereignis?\n"
          +" (0) Lob von der eigenen Partei\n"
          +" (1) Tadel von der eigenen Partei\n"
          +" (2) Lob von der Wirtschaft\n"
          +" (3) Erwischt");
      eingabe=new Scanner(System.in).nextInt();
      switch(eingabe){
      case 0: 
        polli.parteilob();
        break;
      case 1:
        polli.parteitadel();
        break;
      case 2:
        polli.wirtschaftslob();
        break;
      case 3:
        polli.erwischt();
        break;
      }
      System.out.println("Fiktive Person befindet sich in"
          +" (Teil)-Zustaenden:");
      // TODO
      System.out.println("\n----------------");
    }
  }

  public static void main(String[] args) {
    new Steuerung();
  }
}
