import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Joc: Guess the number
        // Task1: Declara o variabila si salveaza un ea un nr de la 1 la 100. Numele variabilei sa fie nr ascuns.
        // Task2: Cere de la user sa ghiceasca numarul ascuns. Daca nr ghicit e mai mic decat nr ascuns, afiseaza "mai mult",daca e mai mare afiseaza "mai putin". Altfel afiseaza "bravo ai ghicit.
        // Task3: Pune toata logica intr un while
        // Task4: Inlocuieste nr ascuns cu un nr RANDOM
        // Task5: Construieste un mecanism care sa numere fiecare incercare de a ghici si sa iti afiseze nr total de afisari
        // Task6: Construieste un mecanism care sa stabileasca un nr fix de vieti si care sa scada cate o viata cand raspunsul este gresit
        // Task7: Easter egg - Daca user introduce -666 sa se afiseze mesajul "ai descoperit un bonus de 3 vieti si sa se acorde


        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int nrAscuns = rnd.nextInt(1000);
        System.out.println("Guess the number!");
        int nrIncercari = 0;
        int nrVieti = 10;
        int easterEgg = -666;

        while (true) {
            if (nrVieti == 0) {
                System.out.println("LOSER");
                break;
            }
            System.out.println("Ghiceste numarul");
            int nrUser = scan.nextInt();
            if (nrUser == easterEgg) {
                System.out.println("Ai primit 3 vieti");
                nrVieti += 3;
            }
            nrIncercari++;
            if (nrUser < nrAscuns) {
                System.out.println("Mai mult");
                nrVieti--;
            } else if (nrUser > nrAscuns) {
                System.out.println("Mai putin");
                nrVieti--;
            } else {
                System.out.println("Ai ghicit." + " Ai folosit " + nrIncercari + " incercari.");
                break;
            }

        }
    }
}
