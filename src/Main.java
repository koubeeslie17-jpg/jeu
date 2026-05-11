//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner; // Pour  lire ce que le joueur entre sur le clavier
import java.util.Random;  // Pour générer les nombres aléatoires

public class Main {
    public static void main(String[] args) {
        // créé un scanner pour lire ce que le joueur  entre
        Scanner scanner = new Scanner(System.in);
        // créé un générateur de nombres aléatoires
        Random random = new Random();

        // pour générer un nombre secret entre 1 et 100
        int secretNumber = random.nextInt(100) + 1;
        System.out.println("Trouvez le nombre entre 1 et 100, vous avez droit à 10 essais");

        // Boucle pour les 10 essais
        for(int i=1; i<=10; i++) {
            System.out.println("Essayez un nombre : ");
            int number = scanner.nextInt(); // voir le nombre entrer par le joueur

            // pour comparer le nombre du joueur avec le nombre secret
            if(number > secretNumber) {
                System.out.println("Nombre proposé plus grand");
            }else if(number < secretNumber) {
                System.out.println("Nombre proposé plus petit");
            }else {
                System.out.println("Félicitations vous avez gagné");
                scanner.close(); // pour fermer le scanner
                return;          // pour sortir du programme
            }
        }
        // pour sortir de la boucle si le joueur a perdu
        System.out.println("Désolé vous avez perdu");
        scanner.close();
    }
}