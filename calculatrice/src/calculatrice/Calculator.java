package calculatrice;
import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOpérations disponibles :");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. MULTIPLICATION ");
            System.out.println("4. Division");
            System.out.println("5. Sinus");
            System.out.println("6. Cosinus");
            System.out.println("7. Logarithme");
            System.out.println("8. Exponentielle");
            System.out.println("0. Quitter");

            System.out.print("Choisissez une opération (0-8) : ");
            int choix = scanner.nextInt();

            if (choix == 0) {
                System.out.println("Au revoir !");
                break;
            }

            double x=0;
            double x1 = 0;
            double x2=0;

            if (choix >= 5) {
                System.out.print("Entrez la valeur x : ");
                x = scanner.nextDouble();
            } else {
                System.out.print("Entrez la valeur x1 : ");
                x1 = scanner.nextDouble();
                System.out.print("Entrez la valeur x2 : ");
                x2 = scanner.nextDouble();
            }
            switch (choix) {
            case 1:
                Addition addition = new Addition(x1, x2);
                System.out.println("Résultat : " + addition.calcul());
                break;
            case 2:
                Soustraction soustraction = new Soustraction(x1, x2);
                System.out.println("Résultat : " + soustraction.calcul());
                break;
            case 3:
                Multiplication multiplication = new Multiplication(x1, x2);
                System.out.println("Résultat : " + multiplication.calcul());
                break;
            case 4:
                Division division = new Division(x1, x2);
                System.out.println("Résultat : " + division.calcul());
                break;
            case 5:
                Sin sin = new Sin(x);
                System.out.println("Résultat : " + sin.calcul());
                break;
            case 6:
                Cos cos = new Cos(x);
                System.out.println("Résultat : " + cos.calcul());
                break;
            case 7:
                Log log = new Log(x);
                System.out.println("Résultat : " + log.calcul());
                break;
            case 8:
                Exp exp = new Exp(x);
                System.out.println("Résultat : " + exp.calcul());
                break;
            default:
                System.out.println("Opération invalide. Veuillez choisir une opération valide (0-8).");
        }
    }

    scanner.close();
}
}