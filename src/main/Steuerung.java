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
                  +" (3) Kritik von der Wirtschaft\n"
                  +" (4) Erwischt\n");
          eingabe=new Scanner(System.in).nextInt();
          switch (eingabe) {
        case 0 -> polli.parteilob();
        case 1 -> polli.parteitadel();
        case 2 -> polli.wirtschaftslob();
        case 3 -> polli.wirtschaftskritik();
        case 4 -> polli.erwischt();
      }

      System.out.println(polli.getName() + " befindet sich in"
          +" (Teil)-Zustaenden:");
      polli.ausgabe();
      System.out.println("\n----------------");
    }
  }

  public static void main(String[] args) {
    new Steuerung();
  }
}
