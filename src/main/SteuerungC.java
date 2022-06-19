package main;

import entity.Person;

import java.util.Scanner;

public class SteuerungC {
    public SteuerungC(Person polli){
        int eingabe = -1;

        if(polli.aktiv()){
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
        }

        System.out.println(polli.getName() + " befindet sich in"
                    +" (Teil)-Zustaenden:");
        polli.ausgabe();
        System.out.println("\n----------------");

    }
}
