/** 
 * Exercice 1 dans le cadre du devoir 1
 */
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;

/**
 * Class principal
 * Cette classe vérifie si deux nombres entiers sont divisibles ou non
 * Elle possède une méthode principale qui demande à l'utilisateur d'entrer deux nombres entiers, 
 * puis vérifie si l'un est divisible par l'autre.
 * @author theGholem
 * @author ayman-lahdili
 */
public class Divisibility{

  private int a, b; // les deux valeurs à comparer

  /**
   * Constructeur pour la class Divisibility
   * @param a
   * @param b
   */
  public Divisibility(int a, int b){
    this.a=a;
    this.b=b;
  }

   /**
   * Vérifie si un le nombre a sont divisbles par b
   * @return true si a est divisible par b, false sinon
   */
  public boolean isDisvisible() {
    if ( this.a%this.b == 0 ){
      return true;
    } 
    return false;
    
  }

  /**
   * Méthode main qui permet d'instancier la classe Divisibility avec
   * des caractères fournis par l'utilisateur et de générer toutes les
   * permutations possibles.
   */
  public static void main(String[]args) {

    System.out.println("-----> EXO1 \n");
    Scanner input = new Scanner(System.in);

    boolean validInput;
    
    do {
      try {
        validInput=true;
        System.out.println("Premier nombre entier: ");
        int n1 = input.nextInt();
        System.out.println("Second nombre entier: ");
        int n2 = input.nextInt();

        // Vérifier si n1 est divisible par n2
        if ( new Divisibility(n1,n2).isDisvisible() ){
          System.out.println(n1+" est divisible par "+n2+".");
        } 
        // Vérifier si n2 est divisible par n1
        else if ( new Divisibility(n2,n1).isDisvisible() ) {
          System.out.println(n1+" n'est pas divisible par "+n2+". \nPar contre, "+n2+" est divisible par "+n1+".");
        } 
        // Aucun des deux nombres n'est divisible
        else {
          System.out.println("Aucun des deux nombres n'est divisible");
        }

      } 
      // Si l'utilisateur entre une valeur qui ne correspond pas au type attendu (dans ce cas, un entier). Si cette exception est levée, le programme va appeler la méthode next() de l'objet Scanner pour vider la ligne qui contient l'entrée invalide, et va demander à l'utilisateur d'entrer une nouvelle valeur.
      catch (InputMismatchException e) {
        input.next();
        validInput = false;
        System.out.println("Veuiller saisir un nombre entier\n");
      } 
      // Cette exception est levée lorsqu'une division par zéro est effectuée. Si cette exception est levée, le programme va afficher un message indiquant à l'utilisateur qu'il doit entrer un nombre différent de zéro et va redemander une entrée valide.
      catch (ArithmeticException e) {
        validInput = false;
        System.out.println("Veuiller saisir un nombre différent de 0!\n");
      }
    } while (validInput == false);

    input.close();

  }

}
