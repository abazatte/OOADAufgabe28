package main;

import entity.Partei;
import entity.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Parteidialog {
	private Partei partei= new Partei("GrauBlauRosa");
	private Scanner scan = new Scanner(System.in);
	public void dialog(){
		int eingabe=-1;
		while(eingabe !=0){
			System.out.println("Was wollen Sie?\n"
					+" (0) Programm beenden\n"
					+" (1) neue Person hinzufuegen\n"
					+" (2) Person steuern\n"
					+" (3) Personenuebersicht");
			eingabe= scan.nextInt();
			switch(eingabe){
			case 1: 
				String name = scan.next();
				partei.addPerson(new Person(name));
				break;
			case 2:
				int i = 1;
				Collection<Person> tmp = partei.personList();
				List<String> namen = new ArrayList<>();
				for (Person p: tmp) {
					namen.add(p.getName());
					System.out.println("(" + i + ") " + p.getName());
					i++;
				}
				int e = scan.nextInt();
				e--;
				SteuerungC steuerungC = new SteuerungC(partei.getPersonWithName(namen.get(e)));
				break;
			case 3:
				int i1 = 1;
				for (Person p: partei.personList()) {
					System.out.println("(" + i1 + ") " + p.getName());
					System.out.println(p);
					i1++;
				}
				break;
			}
		}
	}
	
	public static void main(String... a){
		new Parteidialog().dialog();
	}
}
