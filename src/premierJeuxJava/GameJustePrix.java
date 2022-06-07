package premierJeuxJava;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Random r = new Random();
		int essai = 0;
		int justeprix = r.nextInt(200); // variable qui limite le juste prix à 200 avec random ->- nextInt
		int prix = 0; // variable qui stock le prix, initalise
		
		while(justeprix != prix) { // tant que le juste prix n'est pas égale au prix, boucle qui se répète tant que la condition n'est pas remplie
			
			System.out.println("Entrer un numero entre 0 et 200");
			Scanner scan = new Scanner(System.in); // scanne la console, pour récuperer le prix mis par le joueur
			
			if(justeprix > prix) { // juste prix strictement suppérieur au prix
				System.out.println("C'est plus !");
			}else {
				System.out.println("C'est moins !");
			}
			
			prix = scan.nextInt(); // scan le message, nextInt récupère le dernier entier qui est mis dans la console
			essai++; // le nombre d'essai pour trouver le juste prix, ++ ajouter 1
		}
		
		System.out.print("Bravo ! Le juste prix est : " + justeprix +"\n");
		System.out.println("En " + essai + " essais ");	
		

	}

}
