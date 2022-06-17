package main;

import java.util.Scanner;

import entity.Partei;

public class Parteidialog {
	private Partei partei= new Partei("GrauBlauRosa");
	
	public void dialog(){
		int eingabe=-1;
		while(eingabe !=0){
			System.out.println("Was wollen Sie?\n"
					+" (0) Programm beenden\n"
					+" (1) neue Person hinzufuegen\n"
					+" (2) Person steuern\n"
					+" (3) Personenuebersicht");
			eingabe=new Scanner(System.in).nextInt();
			switch(eingabe){
			case 1: 
				//TODO
				break;
			case 2:
			  //TODO
				break;
			case 3:
			  //TODO
				break;
			}
		}
	}
	
	public static void main(String... a){
		new Parteidialog().dialog();
	}
}
